/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

import static base.fields.Fields.FieldType.FIELD_TEXT;

public class FieldText implements Fields {

    private final FieldType TYPE = FIELD_TEXT;

    private String field = null;
    private int length = 0;

    /**
     * Constructor complete
     *
     * @param field field name
     * @param length number of characters lenght
     */
    public FieldText(String field, int length) {
        this.field = field;
        this.length = length;
    }

    /**
     * Constructor base
     *
     * @param field field name, in this option the field type is text
     */
    public FieldText(String field) {
        this.field = field;
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
