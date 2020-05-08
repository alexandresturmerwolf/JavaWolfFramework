/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.menus;

/**
 *
 * @author wolfi
 */
public class MenuItemTextParameter extends MenuItemText {

    private String parameter = null;

    public MenuItemTextParameter(int level, String description, String iconName, Class rote, String shortCut, char mnomic, String parameter) {
        super(level, description, iconName, rote, shortCut, mnomic);
        this.parameter = parameter;
    }

    public MenuItemTextParameter(int level, String description, String iconName, Class rote, String parameter) {
        super(level, description, iconName, rote);
        this.parameter = parameter;
    }

}
