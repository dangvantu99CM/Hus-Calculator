package calculator.Model;

import calculator.MenuData.ActionMenuItem;
import calculator.Model.LinkedListStack.Node;
import javax.script.ScriptException;

public class CalculatorModel {

    private Expression exception = new Expression();
    
    public LinkedListQueue<String> listResultQueue =new LinkedListQueue<>();
        
    public boolean isValidExpr(String expr){
       return exception.isValidExpr(expr);
    }
    
    public double valueExpr(String expr){
        return exception.eval(expr);
    }
    
    public double evalJs(String expr) throws ScriptException{
        return exception.evalJs(expr);
    }
    
    public String getHistoryAnswer(){
        if(listResultQueue.isEmpty()){
            return "";
        }
        return listResultQueue.dequeue();
    }
}
