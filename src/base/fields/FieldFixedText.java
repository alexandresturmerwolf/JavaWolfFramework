/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

import base.Entity;

public class FieldFixedText implements Fields {

    private final Fields.FieldType TYPE = Fields.FieldType.FIELD_FIXED_TEXT;

    private String field = null;
    private String alias = null;
    private String values[] = null;

    /**
     * Constructor complete
     *
     * @param field filedname
     * @param alias nome to show end user
     * @param values array with fixed data
     */
    public FieldFixedText(String field, String alias, String values[]) {
        this.field = field;
        this.alias = alias;
        this.values = values;

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
