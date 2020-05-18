/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.Database;

import framework.base.Constants;
import framework.base.Entity;
import framework.base.fields.CFields;
import framework.util.ExceptionAnaliser;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class MigrateDatabase {

    String sql = "";
    String extraTablesReferences = "";

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
                            if(field.)
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
        return sql;
    }

    private String analiseEntrance(String s) {
        if (s.indexOf("*") > 0) {
            s = s.replace("*", "");
            s += " UNIQUE";
        }
        return s;
    }
       
}
