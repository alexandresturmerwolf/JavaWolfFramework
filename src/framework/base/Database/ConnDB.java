/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.Database;

import framework.util.ExceptionAnaliser;
import framework.util.PropertiesManager;
import java.sql.*;

/**
 *
 * @author wolfi
 */
public class ConnDB {
    
    public static ConnDB connDB = null;
    public Connection conn;
    
    public ConnDB() {
        this.conn = null;
        connDB = this;
        connect();
    }
    
    public void connect() {
        PropertiesManager prop = new PropertiesManager("SetupSystem.properties");
        String databaseDriver = prop.getProperty("DATABASE_DRIVER");
        String databaseLocation = prop.getProperty("DATABASE_LOCATION");
        String databaseUser = prop.getProperty("DATABASE_USER");
        String databasePassword = prop.getProperty("DATABASE_PASSWORD");
        prop.close();
        
        try {            
            Class.forName(databaseDriver).newInstance();                        
            try {                
                conn = DriverManager.getConnection(databaseLocation, databaseUser, databasePassword);
            } catch (Exception e) {
                ExceptionAnaliser.errorException(e, "not possible connect to database " + databaseLocation + "(possible location, user or password)");
            } 
        } catch (Exception e) {
            ExceptionAnaliser.errorException(e, "registering driver class " + databaseDriver);
            ExceptionAnaliser.error("Modules path: " + (System.getProperty("java.class.path")));
        }
    }
    
    public boolean isConnected() {
        return conn != null;
    }
    
}
