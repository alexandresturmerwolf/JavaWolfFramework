/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

import base.Entity;

public class FieldRelationMultiple implements Fields {

    private final Fields.FieldType TYPE = FieldType.FIELD_RELATION_MULTIPLE;
    private Entity entity = null;

    /**a
     * Constructor complete
     *
     * @param entity entity of foreign key
     */
    public FieldRelationMultiple(Entity entity) {
        this.entity = entity;
    }

    /**
     * Validate input the data information
     *
     * @param o data value to make teste
     * @return true or false
     */
    @Override
    public boolean validateData(Object o) {
        String s = (String) o;
        return true; // s.matches("[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*|[0-9]|.|,");
    }
}
