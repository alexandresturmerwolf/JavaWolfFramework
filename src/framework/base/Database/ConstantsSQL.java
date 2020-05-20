/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.Database;

/**
 *
 * @author wolfi
 */
public class ConstantsSQL {

    public static final String SQL_UNIQUE = "UNIQUE";
    public static final String SQL_NOT_NULL = "NOT NULL";
    public static final String SQL_ADD_CONSTRAINT = "ALTER TABLE %s ADD CONSTRAINT %s FOREIGN KEY(%s) REFERENCES %s (%s)";

}
