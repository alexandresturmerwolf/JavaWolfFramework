package entities;

import framework.base.Entity;

public class Contatos {

    public Entity entidade = new Entity("contatos", "Contatos");

    public Contatos() {
        entidade.addFieldID();
        entidade.addFieldText("tipo", "Tipo");
        entidade.addFieldText("descricao", "Descrição");
    }
}
