/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

import base.Entity;

public class FieldRelationMultiple extends Fields {

    private final Fields.FieldType TYPE = FieldType.FIELD_RELATION_MULTIPLE;
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

}
