/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import base.fields.*;

/**
 *
 * @author wolfi
 */
public class Entity extends Fields {

    public final int DOCUMENT_CPF = 0;
    public final int DOCUMENT_CNPJ = 1;

    private String tableName = null;
    private String alias = null;

    public Entity() {

    }

    public Entity(String tableName, String alias) {
        this.tableName = tableName;
        this.alias = alias;
    }
    
    public Entity getEntity() {
        return this;
    }

}
