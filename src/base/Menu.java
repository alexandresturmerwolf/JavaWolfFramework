/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import base.menus.MenuItemSeparator;
import base.menus.MenuItemText;
import base.menus.MenuItemTextParameter;
import entities.*;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class Menu {

    private ArrayList menu = new ArrayList();

    public Menu() {
        menu.add(new MenuItemText(1, "Cadastros", "icoCadastros"));
        menu.add(new MenuItemText(2, "Clientes", "icoClientes", Clientes.class));
        menu.add(new MenuItemText(2, "Fornecedores", "icoFornecedores", Fornecedores.class));
        menu.add(new MenuItemSeparator(2));
        menu.add(new MenuItemText(2, "Tabelas de Referências", ""));
        menu.add(new MenuItemText(3, "Estados (Unidades Federativas)", "icoEstados", Estados.class));
        menu.add(new MenuItemText(3, "Cidades", "icoCidades", Cidades.class));
        menu.add(new MenuItemText(1, "Movimentos", "icoMovimentos"));
        menu.add(new MenuItemText(1, "Linguagens", "icoLinguagens"));
        menu.add(new MenuItemTextParameter(2, "Português Brasil", "icoPT-BR", Linguagens.class, "pt-br"));
        menu.add(new MenuItemTextParameter(2, "Inglês", "icoEN", Linguagens.class, "en"));
        menu.add(new MenuItemTextParameter(2, "Espanhol", "icoES", Linguagens.class, "es"));

    }
}
