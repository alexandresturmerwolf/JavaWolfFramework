package framework.base;

public class Languages extends Entity {

    public Languages(String tableName, String tableAlias) {
        super(tableName, tableAlias);
    }

    @Override
    public Entity addCallBackFields(Entity entity) {
        return entity;
    }

}
