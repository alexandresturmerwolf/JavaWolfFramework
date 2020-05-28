/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import entities.Cidades;
import entities.Fornecedores;
import entities.Estados;
import entities.Clientes;
import framework.base.menus.MenuItemSeparator;
import framework.base.menus.MenuItemText;
import framework.base.menus.MenuItemTextParameter;
import framework.base.Languages;
import framework.base.Menus;

/**
 *
 * @author wolfi
 */
public class Menu extends Menus {

    @Override
    public Menus addCallBackFields(Menus menus) {
        menus.add(new MenuItemText(0, "Cadastros", "icoCadastros"));
        menus.add(new MenuItemText(1, "Clientes", "icoClientes", Clientes.class));
        menus.add(new MenuItemText(1, "Fornecedores", "icoFornecedores", Fornecedores.class));
        menus.add(new MenuItemSeparator(1));
        menus.add(new MenuItemText(1, "Tabelas de Referências", ""));
        menus.add(new MenuItemText(2, "Estados (Unidades Federativas)", "icoEstados", Estados.class));
        menus.add(new MenuItemText(2, "Cidades", "icoCidades", Cidades.class));

        menus.add(new MenuItemText(0, "Movimentos", "icoMovimentos"));

        menus.add(new MenuItemText(0, "Linguagens", "icoLinguagens"));
        menus.add(new MenuItemTextParameter(1, "Português Brasil", "icoPT-BR", Languages.class, "pt-br"));
        menus.add(new MenuItemTextParameter(1, "Inglês", "icoEN", Languages.class, "en"));
        menus.add(new MenuItemTextParameter(1, "Espanhol", "icoES", Languages.class, "es"));

        return menus;
    }
}
