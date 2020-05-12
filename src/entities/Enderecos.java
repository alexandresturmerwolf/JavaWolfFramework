package entities;

import framework.base.Entity;

public class Enderecos extends Entity {

    public Enderecos() {
        super("enderecos", "Endereços");
    }

    @Override
    public Entity addCallBackFields(Entity entity) {
        entity.addFieldID();
        entity.addFieldText("tipo", "Tipo");
        entity.addFieldText("endereco", "Endereço");
        entity.addFieldText("complemento", "Complemento");
        entity.addRelationSimple(new Estados());
        entity.addFieldText("preferencial", "Preferencial");

        return entity;
    }
}
