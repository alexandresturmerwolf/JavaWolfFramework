/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.fields;

/**
 *
 * @author wolfi
 */
public interface Fields {

    public enum FieldType {
        FIELD_TEXT, FIELD_INTEGER, FIELD_NUMBER, FIELD_DATE, FIELD_MEMO, FIELD_RELATION_MULTIPLE, FIELD_RELATION_SIMPLE, FIELD_FIXED_TEXT;
    }
    
    public boolean validateData(Object o);

}
