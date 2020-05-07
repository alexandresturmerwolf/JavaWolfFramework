package entities;

import base.Entity;

public class Cidades extends Entity {

    public Entity entidade = new Entity("cidades", "Cidades");

    public Cidades() {
        entidade.addFieldID();
        entidade.addFieldTextRequired("cidade", "Cidade");
    }
}
