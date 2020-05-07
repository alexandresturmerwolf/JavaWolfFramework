/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package base.fields;

public class FieldSelectText extends Fields {

    private final Fields.FieldType TYPE = Fields.FieldType.FIELD_SELECT_TEXT;
    

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
    public FieldSelectText(String field, String alias, String values[]) {
        this.field = field;
        this.alias = alias;
        this.values = values;

    }

}
