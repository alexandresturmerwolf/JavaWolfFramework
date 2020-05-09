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
public class MigrateDatabase {

    StringBuffer sb = new StringBuffer();

    public MigrateDatabase() {
        
    }

    public StringBuffer generateInitialSQL() {
        ConnDB connDB = new ConnDB();
        if(connDB.isConnected()){
            
        }
        
        return sb;
    }

}
