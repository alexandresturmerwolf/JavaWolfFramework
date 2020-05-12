/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package framework.base.fields;

public class FieldText extends CFields {

    public final FieldType TYPE = CFields.FieldType.FIELD_TEXT;

    private String field = null;
    private String alias = null;
    private int length = 0;

    /**
     * Constructor complete
     *
     * @param field field name
     * @param alias name to show to end user
     * @param length number of characters lenght
     */
    public FieldText(String field, String alias, int length) {
        this.field = field;
        this.alias = alias;
        this.length = length;
    }

    /**
     * Constructor base
     *
     * @param field field name, in this option the field type is text
     * @param alias name to show to end user
     */
    public FieldText(String field, String alias) {
        this.field = field;
        this.alias = alias;
    }

    @Override
    public String getSQL() {
        String sql = "";
        if (length > 0) {
            sql = field + " VARCHAR(" + length + ")";
        } else {
            sql = field + " TEXT";
        }
        return sql;
    }

}
