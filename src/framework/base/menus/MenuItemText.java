/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.base.menus;

import framework.base.Entity;

/**
 *
 * @author wolfi
 */
public class MenuItemText extends MenuType{

    private int level = 0;
    private String iconName = null;
    private String description = null;
    private Class<Entity> rote = null;
    private String shortCut = null;
    private char mnomic = 0;

    public MenuItemText(int level, String description, String iconName, Class rote, String shortCut, char mnomic) {
        this.level = level;
        this.iconName = iconName;
        this.description = description;
        this.rote = rote;
        this.shortCut = shortCut;
        this.mnomic = mnomic;
    }

    public MenuItemText(int level, String description, String iconName, Class rote) {
        this.level = level;
        this.description = description;
        this.iconName = iconName;
        this.rote = rote;       
    }

    public MenuItemText(int level, String description, String iconName) {
        this.level = level;
        this.description = description;
        this.iconName = iconName;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getIconName() {
        return iconName;
    }
}
