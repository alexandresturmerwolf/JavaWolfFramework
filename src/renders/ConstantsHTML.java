/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renders;

/**
 *
 * @author wolfi
 */
public class ConstantsHTML {

    public static final String MENU_HEADER
            = "<ul class=\"sidebar-menu tree\" data-widget=\"tree\">\n";

    public static final String MENU_MIDDLE
            = "\t<li class=\"header\">%s</li>\n";

    public static final String MENU_ITEM_LEVEL_0_HEADER
            = "\t<li class=\"treeview menu-open\" style=\"height: auto;\">\n";

    public static final String MENU_ITEM_LEVEL_0_MIDDLE
            = "\t<a href=\"%s\">\n"
            + "\t\t<i class=\"fa %s\"></i>\n"
            + "\t\t<span>%s</span>\n"
            + "\t\t<span class=\"pull-right-container\">\n"
            + "\t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n"
            + "\t\t</span>\n"
            + "\t</a>\n";

    public static final String MENU_ITEM_LEVEL_0_FOOTER
            = "</li>\n";

    public static final String MENU_ITEM_LEVEL_1_HEADER
            = "";

    public static final String MENU_ITEM_LEVEL_1_FOOTER
            = "";

    public static final String MENU_ITEM_LEVEL_2_HEADER
            = "";

    public static final String MENU_ITEM_LEVEL_2_FOOTER
            = "";

    public static final String MENU_ITEM_LEVEL_3_HEADER
            = "";

    public static final String MENU_ITEM_LEVEL_3_FOOTER
            = "";

    public static final String MENU_FOOTER
            = "</ul>\n";
}
