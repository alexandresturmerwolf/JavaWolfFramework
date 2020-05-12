package entities;

import framework.base.Entity;

public class Cidades extends Entity {

    public Cidades() {
        super("cidades", "Cidades");
    }

    @Override
    public Entity addCallBackFields(Entity entity) {
        entity.addFieldID();
        entity.addFieldText("cidade*", "Cidade");
        
        return entity;
    }
}
