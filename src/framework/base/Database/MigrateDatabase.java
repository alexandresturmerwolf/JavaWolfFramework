/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.Database;

import entities.Clientes;
import framework.base.Constants;
import framework.base.Entity;
import framework.base.fields.CFields;
import framework.util.ExceptionAnaliser;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class MigrateDatabase {

    String sql = "";

    public MigrateDatabase() {

    }

    public String generateInitialSQL() {
        ConnDB connDB = new ConnDB();
        if (connDB.isConnected()) {
            try {
                File d = new File(Constants.BASE_PATH_ENTITIES);
                for (File f : d.listFiles()) {
                    try {
                        String fileName = "entities." + f.getName().substring(0, f.getName().length() - 5);
                        ExceptionAnaliser.info("Parsing " + f.getName() + " to " + fileName + " for create instance object");

                        Entity objEntity = (Entity) Class.forName(fileName).newInstance();
                        sql += objEntity.getSQL() + "(";

                        ArrayList fi = objEntity.getFields();
                        for (int i = 0; i < fi.size(); i++) {
                            CFields fld = (CFields) fi.get(i);
                            sql += analiseEntrance(fld.getSQL()) + ", ";
                        }
                        sql = sql.substring(0, sql.length() - 2) + ");\n";
                    } catch (Exception e) {
                        ExceptionAnaliser.errorException(e, "processing entity " + f.getName());
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


/*

=========
Method meth = cls.getMethod("getTableName");
                        Object retobj = meth.invoke(cls.newInstance());
                        String retorno = (String) retobj;
                        System.out.println("Retorno " + retorno);
===
for (Field fields : fileName.getClass().getDeclaredFields()) {
                            System.out.print(fields.getName() + ", ");
                        }

                        System.out.println("");
                        System.out.println("Métodos: ");
                        for (Method m : fileName.getClass().getMethods()) {
                            System.out.print(m.getName() + ", ");
                        }*/
