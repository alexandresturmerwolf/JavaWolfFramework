/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import framework.base.Entity;

/**
 *
 * @author wolfi
 */
public class Clientes extends Entity {

    public Clientes() {
        super("clientes", "Clientes");
    }

    @Override
    public Entity addCallBackFields(Entity entity) {
        entity.addFieldID();
        entity.addFieldText("nome*", "Nome");
        entity.addDocumentTypeText("documento", "Documento");
        entity.addFieldDate("datanasc", "Data nascimento");
        entity.addRelationMultiple(new Enderecos());
        entity.addRelationMultiple(new Contatos());

        return entity;
    }
}
