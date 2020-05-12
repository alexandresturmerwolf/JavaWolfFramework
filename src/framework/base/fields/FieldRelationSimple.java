/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package framework.base.fields;

import framework.base.Entity;

public class FieldRelationSimple extends CFields {

    public final CFields.FieldType TYPE = CFields.FieldType.FIELD_RELATION_SIMPLE;
    private Entity entity = null;

    public FieldRelationSimple(Entity entity) {
        this.entity = entity;
    }

    @Override
    public String getSQL() {
        String sql = "rel_" + entity.getTableName() + " INTEGER NOT NULL";
        return sql;
    }

}
