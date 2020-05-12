package entities;

import framework.base.Entity;

public class Estados extends Entity {

    public Estados() {
        super("estados", "Estados");
    }

    @Override
    public Entity addCallBackFields(Entity entity) {
        entity.addFieldID();
        entity.addFieldText("nome", "Nome");
        entity.addFieldText("abreviatura", "Reduzido");

        return entity;
    }
}
