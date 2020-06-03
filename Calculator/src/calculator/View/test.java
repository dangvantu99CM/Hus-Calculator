/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author tudv
 */
public class test extends JFrame {

    public test() {
        JPanel panel = new JPanel(new MigLayout(
                "debug",
                "[][grow, fill][]",
                ""));
        JButton comp1 = new JButton("Comp1");
        JButton comp2 = new JButton("Comp2");
        JButton comp3 = new JButton("Comp3");

        panel.add(comp1,
                "width 50:150:150");
        panel.add(comp2);

        panel.add(comp3,
                "width 50:70:70");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        test t = new test();
    }

}
