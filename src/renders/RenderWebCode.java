/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renders;

import framework.base.Menus;
import framework.base.menus.MenuType;
import java.util.ArrayList;

/**
 *
 * @author wolfi
 */
public class RenderWebCode {

    private Menus menus = null;

    public RenderWebCode(Menus menus) {
        this.menus = menus;
    }

    public String generateMenu() {
        String code = "";
        code += generateHeader();
        code += generateMiddle();
        code += generateBody();
        code += generateFooter();
        return code;
    }

    public String generateHeader() {
        String code = ConstantsHTML.MENU_HEADER;
        return code;
    }
    
    public String generateMiddle() {
        String code = ConstantsHTML.MENU_MIDDLE;
        return code;
    }

    public String generateBody() {
        ArrayList<MenuType> m = menus.getMenus();
        String code = "";
        int pos = 0;
        while (m.get(pos).getLevel() == 0) {
            code += String.format(ConstantsHTML.MENU_ITEM_LEVEL_0_MIDDLE, m.get(pos).getUrl(), m.get(pos).getIconName(), m.get(pos).getDescription());
            while (((MenuType) m.get(pos)).getLevel() == 1) {
                code += "";
                while (((MenuType) m.get(pos)).getLevel() == 2) {
                    code += "";
                    while (((MenuType) m.get(pos)).getLevel() == 3) {
                        code += "";
                        while (((MenuType) m.get(pos)).getLevel() == 4) {
                            code += "";
                            pos++;
                        }
                        pos++;
                    }
                    pos++;
                }
                pos++;
            }
            pos++;
        }
        return code;
    }

    public String generateFooter() {
        String code = ConstantsHTML.MENU_FOOTER;
        return code;
    }

}
