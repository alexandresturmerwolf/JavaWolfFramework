/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base;

import framework.base.menus.MenuType;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public abstract class Menus {

    private Menus callMenus = null;
    private ArrayList menuList = new ArrayList();

    public Menus() {
        callMenus = addCallBackFields(this);
    }

    public abstract Menus addCallBackFields(Menus menus);

    public void add(MenuType m) {
        menuList.add(m);
    }

    public ArrayList getMenus() {
        return menuList;
    }

}
