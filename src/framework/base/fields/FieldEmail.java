/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package framework.base.fields;

public class FieldEmail extends CFields {

    public final CFields.FieldType TYPE = CFields.FieldType.FIELD_EMAIL;

    private String field = null;
    private String alias = null;

    /**
     * Constructor complete
     *
     * @param field field name
     * @param alias alternativa name to show to end user
     */
    public FieldEmail(String field, String alias) {
        this.field = field;
        this.alias = alias;
    }

    @Override
    public String getSQL() {
        String sql = field + " TEXT";
        return sql;
    }

    @Override
    public FieldType getFieldType() {
        return TYPE;
    }
}
