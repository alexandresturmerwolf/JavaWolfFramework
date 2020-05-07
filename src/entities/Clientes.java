/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import base.Entity;

/**
 *
 * @author wolfi
 */
public class Clientes extends Entity {

    public Entity entidade = new Entity("clientes", "Clientes");

    public Clientes() {
        entidade.addFieldID();
        entidade.addFieldTextRequired("nome", "Nome");
        entidade.addDocumentTypeText("documento", "Documento");
        entidade.addFieldDate("datanasc", "Data nascimento");
        entidade.addRelationMultiple(new Enderecos().entidade);
        entidade.addRelationMultiple(new Contatos().entidade);
    }
}
