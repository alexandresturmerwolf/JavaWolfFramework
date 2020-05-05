/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

import static base.fields.Fields.FieldType.FIELD_DATE;

public class FieldDate implements Fields {

    private final Fields.FieldType TYPE = FIELD_DATE;

    private String field = null;
    private String alias = null;

    /**
     * Constructor complete
     *
     * @param field field name 
     * @param alias alternativa name to show to end user
     */
    public FieldDate(String field, String alias) {
        this.field = field;
        this.alias = alias;
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
