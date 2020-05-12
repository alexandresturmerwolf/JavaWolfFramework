/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.util;

import entities.*;
import framework.base.Entity;
import framework.base.fields.*;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class TesteClasses {

    public static void main(String[] args) {
        try {

            //Clientes c = new Clientes();
            Entity c = (Entity) Class.forName("entities.Clientes").newInstance();
            System.out.println(c.getTableName());
            System.out.println(c.getSQL());

            String sql = "";
            ArrayList f = c.getFields();
            for (int i = 0; i < f.size(); i++) {
                CFields fld = (CFields) f.get(i);

                System.out.println(fld.getSQL());
                if (fld instanceof FieldText) {

                    System.out.println(((FieldText) fld).TYPE);
                } else if (fld instanceof FieldDate) {

                    System.out.println(((FieldDate) fld).TYPE);
                } else if (fld instanceof FieldMaskText) {

                    System.out.println(((FieldMaskText) fld).TYPE);
                } else if (fld instanceof FieldRelationMultiple) {

                    System.out.println(((FieldRelationMultiple) fld).TYPE);
                } else if (fld instanceof FieldRelationSimple) {

                    System.out.println(((FieldRelationSimple) fld).TYPE);
                } else if (fld instanceof FieldSelectText) {

                    System.out.println(((FieldSelectText) fld).TYPE);
                }
            }
            /*
            Clientes cli = new Clientes();
            //Object cli = Class.forName("entities.Clientes").newInstance();

            // getclass method 
            Class cls = cli.getClass();
            System.out.println("The name of class is " + cls.getName());

            // Getting the constructor of the class through the 
            // object of the class 
            Constructor constructor = cls.getConstructor();
            System.out.println("The name of constructor is " + constructor.getName());

            System.out.println("The public methods of class are : ");

            // Getting methods of the class through the object 
            // of the class by using getMethods 
            Method[] methods = cls.getMethods();

            // Printing method names 
            for (Method method : methods) {
                System.out.println("Importantes: " + method.getName());
            }

            // creates object of desired method by providing the 
            // method name and parameter class as arguments to 
            // the getDeclaredMethod 
            //Method methodcall1 = cls.getDeclaredMethod("method2", int.class);
            Method methodcall1 = cls.getMethod("getTableName");
            // methodcall1.setAccessible(true);
            String s = (String) methodcall1.invoke(cli);
            System.out.println("=============" + s);

            System.out.println("---------------FIm");

            // invokes the method at runtime 
            //methodcall1.invoke(obj, 19);
            //String s = methodcall1.invoke(obj);
            // creates object of the desired field by providing 
            // the name of field as argument to the  
            // getDeclaredField method 
            Field field = cls.getDeclaredField("tableName");

            // allows the object to access the field irrespective 
            // of the access specifier used with the field 
            field.setAccessible(true);

            // takes object and the new value to be assigned 
            // to the field as arguments 
            field.set(cli, "JAVA");

            // Creates object of desired method by providing the 
            // method name as argument to the getDeclaredMethod 
            Method methodcall2 = cls.getDeclaredMethod("method1");

            // invokes the method at runtime 
            methodcall2.invoke(cli);

            // Creates object of the desired method by providing 
            // the name of method as argument to the  
            // getDeclaredMethod method 
            Method methodcall3 = cls.getDeclaredMethod("method3");

            // allows the object to access the method irrespective  
            // of the access specifier used with the method 
            methodcall3.setAccessible(true);

            // invokes the method at runtime 
            methodcall3.invoke(cli);
             */
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
