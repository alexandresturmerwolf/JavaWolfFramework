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
public abstract class MenuType {

    public abstract int getLevel();

    public abstract String getDescription();

    public abstract String getIconName();
    
    public String getUrl() {
        return "#";
    }
}
