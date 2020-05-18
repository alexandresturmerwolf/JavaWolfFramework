package framework.base;

import framework.base.fields.CFields;

public abstract class Entity extends CFields {

    public final CFields.FieldType TYPE = CFields.FieldType.FIELD_NONE;

    private String tableName = null;
    private String tableAlias = null;
    private Entity callEntity = null;

    public Entity(String tableName, String tableAlias) {
        this.tableName = tableName;
        this.tableAlias = tableAlias;
        callEntity = addCallBackFields(this);
    }

    public String getTableName() {
        return tableName;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public abstract Entity addCallBackFields(Entity entity);

    @Override
    public String getSQL() {
        String sql = "CREATE TABLE " + tableName;
        return sql;
    }

    @Override
    public FieldType getFieldType() {
        return TYPE;
    }
}
