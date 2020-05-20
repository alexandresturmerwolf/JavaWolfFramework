/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.Database;

import framework.base.Constants;
import framework.base.Entity;
import framework.base.fields.CFields;
import framework.base.fields.FieldID;
import framework.util.ExceptionAnaliser;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class MigrateDatabase {

    String sql = "";
    String sqlExtras = "";
    String sqlConstraints = "";

    public MigrateDatabase() {

    }

    public String generateInitialSQL() {
        ConnDB connDB = new ConnDB();
        if (connDB.isConnected()) {
            try {
                File directory = new File(Constants.BASE_PATH_ENTITIES);
                for (File files : directory.listFiles()) {
                    try {
                        String fileName = "entities." + files.getName().substring(0, files.getName().length() - 5);
                        ExceptionAnaliser.info("Parsing " + files.getName() + " to " + fileName + " for create instance object");

                        Entity objEntity = (Entity) Class.forName(fileName).newInstance();
                        sql += objEntity.getSQL() + "(";

                        ArrayList fields = objEntity.getFields();
                        for (int i = 0; i < fields.size(); i++) {
                            CFields field = (CFields) fields.get(i);
                            sql += analiseEntrance(field.getSQL()) + ", ";

                            if (field.getFieldType() == CFields.FieldType.FIELD_RELATION_MULTIPLE) {
                                String tableDestiny = field.getSQL().substring(0, field.getSQL().indexOf(" "));
                                sqlExtras += objEntity.getSQL() + "_" + tableDestiny;
                                sqlExtras += "(" + new FieldID().getSQL() + ", id_";
                                sqlExtras += objEntity.getTableName() + " " + ConstantsSQL.SQL_NOT_NULL + ", ";
                                sqlExtras += "id" + tableDestiny.substring(tableDestiny.lastIndexOf("_")) + " " + ConstantsSQL.SQL_NOT_NULL;
                                sqlExtras += ");\n";

                                //sqlConstraints += String.format(ConstantsSQL.SQL_ADD_CONSTRAINT, args);
                                
                                //"ALTER TABLE %s ADD CONSTRAINT %s FOREIGN KEY(%s) REFERENCES %s (%s)";

                            } else if (field.getFieldType() == CFields.FieldType.FIELD_RELATION_SIMPLE) {
                                sqlConstraints += "";
                            }
                        }
                        sql = sql.substring(0, sql.length() - 2) + ");\n";
                    } catch (Exception e) {
                        ExceptionAnaliser.errorException(e, "processing entity " + files.getName());
                    }
                }
            } catch (Exception e) {
                ExceptionAnaliser.errorException(e, "not possible find entities");
            }
        } else {
            ExceptionAnaliser.error("database not connected");
        }
        return sql + sqlExtras + sqlConstraints;
    }

    private String analiseEntrance(String s) {
        if (s.indexOf("*") > 0) {
            s = s.replace("*", "");
            s += " " + ConstantsSQL.SQL_UNIQUE;
        }
        return s;
    }

}
