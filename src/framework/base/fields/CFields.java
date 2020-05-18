package framework.base.fields;

import framework.base.Entity;
import java.util.ArrayList;

abstract public class CFields {

    private ArrayList<CFields> fields = new ArrayList();

    public abstract String getSQL();

    public abstract FieldType getFieldType();

    public enum FieldType {
        FIELD_TEXT, FIELD_INTEGER, FIELD_NUMBER, FIELD_DATE, FIELD_MEMO, FIELD_RELATION_MULTIPLE, FIELD_RELATION_SIMPLE, FIELD_SELECT_TEXT, FIELD_ID, FIELD_MASK_TEXT, FIELD_EMAIL, FIELD_NONE;
    }

    public void addFieldText(String field, String alias) {
        fields.add(new FieldText(field, alias));
    }

    public void addFieldDate(String field, String alias) {
        fields.add(new FieldDate(field, alias));
    }

    public void addFieldEmail(String field, String alias) {
        fields.add(new FieldDate(field, alias));
    }

    public void addRelationMultiple(Entity entity) {
        fields.add(new FieldRelationMultiple(entity));
    }

    public void addRelationSimple(Entity entity) {
        fields.add(new FieldRelationSimple(entity));
    }

    public void addSelectText(String field, String alias, String values[]) {
        fields.add(new FieldSelectText(field, alias, values));
    }

    public void addMaskText(String field, String alias, String mask) {
        fields.add(new FieldMaskText(field, alias, mask));
    }

    public void addDocumentTypeText(String field, String alias) {
        fields.add(new FieldText(field, alias));
    }

    public void addFieldID() {
        fields.add(new FieldID());
    }

    public ArrayList getFields() {
        return fields;
    }

}
