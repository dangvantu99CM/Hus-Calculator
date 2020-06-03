/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.View;

import calculator.MenuData.ActionMenu;
import calculator.MenuData.ActionMenuItem;
import calculator.MenuData.MenuItem;
import calculator.Model.CalculatorModel;
import calculator.View.MainComponent.MainComponent;
import calculator.View.Screen.Screen;
import java.awt.Dialog;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author tudv
 */
public class CalculatorView extends JFrame {

    public ActionMenu actionMenu = new ActionMenu();

    public String expression_By_User = "";

    public Screen scr = new Screen();

    public double result = 0.0;

    public boolean buton_equal_clicked = false;

    public CalculatorModel calModel = new CalculatorModel();

    public String errorMessage = "";

    public CalculatorView() {
        initFrame();
        this.setVisible(true);
    }

    public void initFrame() {
        this.setLayout(new MigLayout("", "[][grow]", "[][]"));
        this.setSize(600, 600);
        this.setLocation(250, 50);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setTitle("HUS CALCULATOR");
        actionMenu.click_number_0 = click_number_0;
        actionMenu.click_number_1 = click_number_1;
        actionMenu.click_number_2 = click_number_2;
        actionMenu.click_number_3 = click_number_3;
        actionMenu.click_number_4 = click_number_4;
        actionMenu.click_number_5 = click_number_5;
        actionMenu.click_number_6 = click_number_6;
        actionMenu.click_number_7 = click_number_7;
        actionMenu.click_number_8 = click_number_8;
        actionMenu.click_number_9 = click_number_9;
        actionMenu.click_add_button = click_add_button;
        actionMenu.click_divide_button = click_divide_button;
        actionMenu.click_open_parent_button = click_open_parent_button;
        actionMenu.click_close_parent_button = click_close_parent_button;
        actionMenu.click_point_button = click_point_button;
        actionMenu.click_percent_button = click_percent_button;
        actionMenu.click_subtract_button = click_subtract_button;
        actionMenu.click_del_button = click_del_button;
        actionMenu.click_equal_button = click_equal_button;
        actionMenu.click_multyply_button = click_multyply_button;
        this.add(scr,"cell 0 0,alignx trailing");
        this.add(new MainComponent(actionMenu), "cell 0 1,alignx trailing");
    }

    ActionMenuItem click_number_0 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
        }
    };

    ActionMenuItem click_number_1 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_2 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_3 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_4 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_5 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_6 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_7 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_8 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_9 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_add_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_multyply_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_divide_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_subtract_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_equal_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            if (expression_By_User == "" || expression_By_User == null) {
                displayErrorMessage("Hãy nhập biểu thức cần tính toán !");
                return;
            }
            try {
                result = calModel.evalJs(expression_By_User);
                scr.setText(String.valueOf(result));
            } catch (ScriptException ex) {
                displayErrorMessage("Biểu thức không hợp lệ !");
            }

        }
    };

    ActionMenuItem click_del_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User = "";
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_percent_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_point_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_open_parent_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    ActionMenuItem click_close_parent_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.setText(expression_By_User);
        }
    };

    void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);

    }

    public static void main(String[] args) {
        CalculatorView mf = new CalculatorView();
    }
}
