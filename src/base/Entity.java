/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import base.fields.FieldRelationMultiple;
import base.fields.FieldDate;
import base.fields.FieldFixedText;
import base.fields.FieldID;
import base.fields.FieldRelationSimple;
import base.fields.FieldText;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class Entity {

    private String tableName = null;
    private String alias = null;
    private ArrayList fields = new ArrayList();

    public Entity() {

    }

    public Entity(String tableName, String alias) {
        this.tableName = tableName;
        this.alias = alias;
    }

    public void addFieldText(String field, String alias) {
        fields.add(new FieldText(field, alias));
    }

    public void addFieldDate(String field, String alias) {
        fields.add(new FieldDate(field, alias));
    }

    public void addRelationMultiple(Entity entity) {
        fields.add(new FieldRelationMultiple(entity));
    }

    public void addRelationSimple(Entity entity) {
        fields.add(new FieldRelationSimple(entity));
    }

    public void addFixedText(String field, String alias, String values[]) {
        fields.add(new FieldFixedText(field, alias, values));
    }

    public void addFieldID() {
        fields.add(new FieldID());
    }

    public Entity getEntity() {
        return this;
    }
}
