/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.MenuData;

import java.util.ArrayList;

/**
 *
 * @author tudv
 */
public class MenuData {

    private ArrayList<MenuItem> dicButtons = new ArrayList<>();
    private ActionMenu actionMenu = null;

    public MenuData(ActionMenu actionMenu) {
        this.actionMenu = actionMenu;
        initMenuItem();
    }

    public ArrayList<MenuItem> initMenuItem() {
        if (dicButtons.size() > 0) {
            return dicButtons;
        }

        dicButtons.add(new MenuItem("Rad", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("Deg", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("x!", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("(", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem(")", actionMenu.click_close_parent_button, null));
        dicButtons.add(new MenuItem("%", actionMenu.click_percent_button, null));
        dicButtons.add(new MenuItem("AC", actionMenu.click_close_parent_button, null));

        dicButtons.add(new MenuItem("lnx", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("sin", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("ln", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("7", actionMenu.click_number_7, null));
        dicButtons.add(new MenuItem("8", actionMenu.click_number_8, null));
        dicButtons.add(new MenuItem("9", actionMenu.click_number_9, null));
        dicButtons.add(new MenuItem("/", actionMenu.click_divide_button, null));

        dicButtons.add(new MenuItem("PI", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("cos", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("log", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("4", actionMenu.click_number_4, null));
        dicButtons.add(new MenuItem("5", actionMenu.click_number_5, null));
        dicButtons.add(new MenuItem("6", actionMenu.click_number_6, null));
        dicButtons.add(new MenuItem("*", actionMenu.click_multyply_button, null));

        dicButtons.add(new MenuItem("e", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("tan", actionMenu.click_del_button, null));
        dicButtons.add(new MenuItem("SQRT", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("1", actionMenu.click_number_1, null));
        dicButtons.add(new MenuItem("2", actionMenu.click_number_2, null));
        dicButtons.add(new MenuItem("3", actionMenu.click_number_3, null));
        dicButtons.add(new MenuItem("-", actionMenu.click_subtract_button, null));
        
        dicButtons.add(new MenuItem("ANS", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("EXP", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("x^y", actionMenu.click_open_parent_button, null));
        dicButtons.add(new MenuItem("0", actionMenu.click_number_0, null));
        dicButtons.add(new MenuItem(".", actionMenu.click_point_button, null));
        dicButtons.add(new MenuItem("=", actionMenu.click_equal_button, null));
        dicButtons.add(new MenuItem("+", actionMenu.click_add_button, null));

        return dicButtons;
    }
}
