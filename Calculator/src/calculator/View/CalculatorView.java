/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.View;

import calculator.MenuData.ActionMenu;
import calculator.MenuData.ActionMenuItem;
import calculator.MenuData.MenuData;
import calculator.MenuData.MenuItem;
import calculator.Model.CalculatorModel;
import calculator.View.HeaderComponent.HeaderComponent;
import calculator.View.MainComponent.MainComponent;
import calculator.View.Screen.Screen;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.GridBagLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author tudv
 */
public class CalculatorView extends JFrame {

    public ActionMenu actionMenu = new ActionMenu();

    private MenuData menuData = new MenuData(actionMenu);

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
        this.setLayout(new BorderLayout());
        this.setSize(850, 525);
        //this.setResizable(false);
        this.setLocation(250, 50);
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
        actionMenu.click_ac_button = click_ac_button;
        actionMenu.click_equal_button = click_equal_button;
        actionMenu.click_multyply_button = click_multyply_button;

        actionMenu.click_PI_button = click_PI_button;

        actionMenu.click_number_e_button = click_number_e_button;

        actionMenu.click_percent_button = click_percent_button;

        actionMenu.click_ans_button = click_ans_button;

        actionMenu.click_factory_button = click_factory_button;

        actionMenu.click_sin_button = click_sin_button;
        
        actionMenu.click_sin_button = click_sin_button;
        
        actionMenu.click_cos_button = click_cos_button;
        
        actionMenu.click_tan_button = click_tan_button;
        
        actionMenu.click_ln_button = click_ln_button;
        
        actionMenu.click_log_button = click_log_button;
        
        actionMenu.click_sqrt_button = click_sqrt_button;
        
        this.setJMenuBar(new HeaderComponent(menuData));
        this.add(scr, BorderLayout.CENTER);
        this.add(new MainComponent(actionMenu), BorderLayout.PAGE_END);
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
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_2 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_3 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_4 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_5 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_6 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_7 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_8 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_9 = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_add_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_multyply_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_divide_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_subtract_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_equal_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            if (expression_By_User == "" || expression_By_User == null) {
                displayErrorMessage("Hãy nhập biểu thức cần tính toán !");
                return;
            }
            if (!calModel.isValidExpr(expression_By_User)) {
                displayErrorMessage("Biểu thức không hợp lệ !");
                return;
            }
            try {
                result = calModel.evalJs(expression_By_User);
                scr.taxtResult.setText(String.valueOf(result));
                while (!calModel.listResultQueue.isEmpty()) {
                    calModel.listResultQueue.dequeue();
                }
                calModel.listResultQueue.enqueue(String.valueOf(result));
                calModel.listResultQueue._iterator();

            } catch (ScriptException ex) {
                Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    ActionMenuItem click_ac_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User = "";
            scr.taxt.setText(expression_By_User);
            scr.taxtResult.setText(expression_By_User);
        }
    };

    ActionMenuItem click_percent_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_point_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_open_parent_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_close_parent_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_PI_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += Math.PI;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_number_e_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += Math.E;
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_ans_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User = calModel.getHistoryAnswer();
            scr.taxt.setText(expression_By_User);
            while (!calModel.listResultQueue.isEmpty()) {
                calModel.listResultQueue.dequeue();
            }
            calModel.listResultQueue.enqueue(String.valueOf(expression_By_User));
            calModel.listResultQueue._iterator();
        }
    };

    ActionMenuItem click_factory_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += "!";
            scr.taxt.setText(expression_By_User);
        }
    };

    ActionMenuItem click_sin_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text + "(";
            scr.taxt.setText(expression_By_User);
        }
    };
    
     ActionMenuItem click_cos_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text + "(";
            scr.taxt.setText(expression_By_User);
        }
    };
        
    ActionMenuItem click_tan_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text + "(";
            scr.taxt.setText(expression_By_User);
        }
    };
        
        
    ActionMenuItem click_ln_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text + "(";
            scr.taxt.setText(expression_By_User);
        }
    };
        
        
     ActionMenuItem click_log_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text + "(";
            scr.taxt.setText(expression_By_User);
        }
    };
        
        
   ActionMenuItem click_sqrt_button = new ActionMenuItem() {

        @Override
        public void onClick(MenuItem menuItem) {
            expression_By_User += menuItem.text + "(";
            scr.taxt.setText(expression_By_User);
        }
    };
        

    void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);

    }

    public static void main(String[] args) {
        CalculatorView mf = new CalculatorView();
    }
}
