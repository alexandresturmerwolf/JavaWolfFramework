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
public class Estados {

    public Entity entidade = new Entity("estados", "Estados");

    public Estados() {
        entidade.addFieldID();
        entidade.addFieldText("nome", "Nome");
        entidade.addFieldText("abreviatura", "Reduzido");
    }
}
