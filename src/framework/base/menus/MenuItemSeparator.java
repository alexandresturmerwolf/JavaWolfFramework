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
public class MenuItemSeparator extends MenuType{

    int level = 0;

    public MenuItemSeparator(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getDescription() {
        return "-";
    }
    
    @Override
    public String getIconName() {
        return "separator";
    }
}
