/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package framework.base.fields;

import framework.base.Entity;

public class FieldRelationMultiple extends CFields {

    public final CFields.FieldType TYPE = FieldType.FIELD_RELATION_MULTIPLE;
    private Entity entity = null;

    /**
     * a
     * Constructor complete
     *
     * @param entity entity of foreign key
     */
    public FieldRelationMultiple(Entity entity) {
        this.entity = entity;
    }
    
    @Override
    public String getSQL() {
        
        String sql = "rel_m_" + entity.getTableName() + " INTEGER NOT NULL";
        return sql;
    }

}
