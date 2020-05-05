package entities;

import base.Entity;


public class Enderecos extends Entity {

    public Entity entidade = new Entity("enderecos", "Endereços");

    public Enderecos() {
        entidade.addFieldID();
        entidade.addFieldText("tipo", "Tipo");
        entidade.addFieldText("endereco", "Endereço");
        entidade.addFieldText("complemento", "Complemento");
        entidade.addRelationSimple(new Estados().entidade);
        entidade.addFieldText("preferencial", "Preferencial");
    }
}
