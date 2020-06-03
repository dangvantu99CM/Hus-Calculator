package calculator.Model;

import calculator.MenuData.ActionMenuItem;
import javax.script.ScriptException;

public class CalculatorModel {

    private Expression exception = new Expression();
        
    public boolean isValidExpr(String expr){
       return exception.isValidExpr(expr);
    }
    
    public double valueExpr(String expr){
        return exception.eval(expr);
    }
    
    public double evalJs(String expr) throws ScriptException{
        return exception.evalJs(expr);
    }
}
