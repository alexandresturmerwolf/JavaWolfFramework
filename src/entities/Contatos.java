package entities;

import framework.base.Entity;

public class Contatos extends Entity {

    public Contatos() {
        super("contatos", "Contatos");
    }

    @Override
    public Entity addCallBackFields(Entity entity) {
        entity.addFieldID();
        entity.addFieldText("tipo", "Tipo");
        entity.addFieldText("descricao", "Descrição");

        return entity;
    }
}
