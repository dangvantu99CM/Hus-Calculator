/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.View.MainComponent;

import calculator.MenuData.ActionMenu;
import calculator.MenuData.MenuData;
import calculator.MenuData.MenuItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author tudv
 */
public class MainComponent extends JPanel {

    private final int SIZE_ROW = 5;
    private final int SIZE_COL = 7;
    private MenuData menuData = null;


    private JButton[][] buttonMatrix = new JButton[SIZE_ROW][SIZE_COL];

    public MainComponent(ActionMenu actionMenu) {
        menuData = new MenuData(actionMenu);
        if (menuData.initMenuItem().size() > 0) {
            initMainComponent(menuData.initMenuItem());;
        }
    }

    public void initMainComponent(ArrayList<MenuItem> listMenuItem) {
        this.setLayout(new MigLayout("", "[][grow]", "[][]"));
        addData(listMenuItem);
    }

    public void addData(ArrayList<MenuItem> listMenuItem) {

        int count = 0;

        if (listMenuItem == null || listMenuItem.size() <= 0) {
            return;
        }

        for (int i = 0; i < SIZE_ROW; i++) {
            for (int j = 0; j < SIZE_COL; j++) {
                MenuItem it = listMenuItem.get(count);
                buttonMatrix[i][j] = new JButton(listMenuItem.get(count).text);
                buttonMatrix[i][j].setSize(100, 40);
                buttonMatrix[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (it != null) {
                            System.out.println("aaaaaaaaaa"+it.text);
                            it.action.onClick(it);
                        }
                    }
                });
                this.add(buttonMatrix[i][j], "cell 0 " + i + ",alignx trailing");
                this.add(buttonMatrix[i][j], "cell 1 " + i + ",growx");
                this.add(buttonMatrix[i][j], "cell 2 " + i + ",growx");
                this.add(buttonMatrix[i][j], "cell 3 " + i + ",growx");
                this.add(buttonMatrix[i][j], "cell 4 " + i + ",growx");
                this.add(buttonMatrix[i][j], "cell 5 " + i + ",growx");
                this.add(buttonMatrix[i][j], "cell 6 " + i + ",growx");
                count++;
            }
        }
    }

}
