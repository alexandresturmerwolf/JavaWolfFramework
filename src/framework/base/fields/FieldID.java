/*
================================================================================
Autor______: Alexandre Stürmer Wolf
Date_______: 05/04/2020
Utility____: 
================================================================================  
 */
package framework.base.fields;

public class FieldID extends CFields{

    private final CFields.FieldType TYPE = CFields.FieldType.FIELD_ID;

    public FieldID() {

    }

    @Override
    public String getSQL() {
        //@TODO: automatic auto increment for diferent databases
       String sql = "id SERIAL PRIMARY KEY NOT NULL";
       return sql;
    }

}
