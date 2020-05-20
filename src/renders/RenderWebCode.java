/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renders;

import menus.Menu;

/**
 *
 * @author wolfi
 */
public class RenderWebCode {

    private Menu menu = null;

    public RenderWebCode(Menu menu) {
        menu = this.menu;
    }

    public String generateMenu() {
        String code = "";
        code += generateHeader(menu);
        code += generateBody(menu);
        code += generateFooter(menu);
        return code;
    }

    public String generateHeader(Menu menu) {
        String code = ConstantsHTML.MENU_HEADER;
        return code;
    }

    public String generateBody(Menu menu) {
        String code = "";
        while
        return code;
    }

    public String generateFooter(Menu menu) {
        String code =  ConstantsHTML.MENU_FOOTER;
        return code;
    }
    
    private int getItensLevel0(){
        int itens = 0;
        
        return itens;
    }

}
