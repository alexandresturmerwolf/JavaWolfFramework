/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

import base.Entity;

public class FieldRelationSimple extends Fields {

    private final Fields.FieldType TYPE = Fields.FieldType.FIELD_RELATION_SIMPLE;
    private Entity entity = null;

    /**
     * a
     * Constructor complete
     *
     * @param entity entity of foreign key
     */
    public FieldRelationSimple(Entity entity) {
        this.entity = entity;
    }

}
