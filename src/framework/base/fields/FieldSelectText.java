/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package framework.base.fields;

public class FieldSelectText extends CFields {

    public final CFields.FieldType TYPE = CFields.FieldType.FIELD_SELECT_TEXT;

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

    @Override
    public String getSQL() {
        String sql = field + " TEXT";

        return sql;
    }

}
