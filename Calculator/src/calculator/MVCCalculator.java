package calculator;

import calculator.View.CalculatorView;
import calculator.Model.CalculatorModel;
import calculator.Controller.CalculatorController;
import calculator.MenuData.ActionMenu;

public class MVCCalculator {

    public static void main(String[] args) {
        
        
        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);

    }
}
