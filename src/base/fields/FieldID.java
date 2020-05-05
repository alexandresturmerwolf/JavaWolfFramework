/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;


public class FieldID implements Fields {

    private FieldType FIELD_ID;
    
    public FieldID() {
        
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
