/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Expression {

    private LinkedListStack<String> lstack = new LinkedListStack<>();
    LinkedListStack<String> operatorStack = new LinkedListStack<>();
    LinkedListStack<String> rankStack = new LinkedListStack<>();

    public boolean isValidExpr(String expr) {

        char[] ch = expr.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.toString(ch[i]).equals("(")) {
                lstack.push(Character.toString(ch[i]));
            }
            if (Character.toString(ch[i]).equals(")")) {
                if (lstack.stack == null) {
                    return false;
                } else {
                    lstack.pop();
                }
            }
        }
        if (lstack.stack == null) {
            return true;
        } else {
            return false;
        }
    }

    public double eval(String formula) {
        String re = "\\(|\\)|\\d+\\.?\\d*|[+-/%^!*]";
        List<String> components = new ArrayList<String>();
        Pattern p = Pattern.compile(re);
        Matcher m = p.matcher(formula);
        while (m.find()) {
            components.add(m.group());
        }
        for (String s : components) {
            System.out.println("aaaaaaaaaa" + s);
        }
        /// System.out.println(components);
        double result = 0.0;
        for (String c : components) {
            if (c.equals("+")) {
                operatorStack.push(c);
            } else if (c.equals("-")) {
                operatorStack.push(c);
            } else if (c.equals("*")) {
                operatorStack.push(c);
            } else if (c.equals("/")) {
                operatorStack.push(c);
            } else if (isNumeric(c)) {
                rankStack.push(c);
            } else if (c.equals(")")) {
                double r1 = 0.0;
                double r2 = 0.0;
                try {
                    if (!rankStack.isEmpty()) {
                        r1 = Double.parseDouble(rankStack.pop());
                        r2 = Double.parseDouble(rankStack.pop());
                    }
                } catch (NullPointerException nf) {
                    System.err.println("Sai định dạng chuỗi nhập vào do không đọc được dấu '-' khi coppy biểu thức từ các file khác vào chương ! Hãy test bằng biểu thức trên KeyBoard của bạn !!!!");
                }

                if (!operatorStack.isEmpty()) {
                    String o = operatorStack.pop();
                    if (o.equals("+")) {
                        result = r1 + r2;
                        rankStack.push(String.valueOf(result));
                    } else if (o.equals("-")) {
                        result = r2 - r1;
                        rankStack.push(String.valueOf(result));
                    } else if (o.equals("*")) {
                        result = r1 * r2;
                        rankStack.push(String.valueOf(result));
                    } else {
                        result = r2 / r1;
                        rankStack.push(String.valueOf(result));
                    }
                }
            }
        }
        return Double.parseDouble(rankStack.pop());
    }

    public double evalJs(String expr) throws ScriptException {
        double result = 0.0;
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            result = Double.parseDouble(engine.eval(expr).toString());
            System.out.println(engine.eval(expr));
        } catch (Exception e) {
            System.out.println("Biểu thức không hợp lệ");
        }
        return result;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws ScriptException {
        Expression expr = new Expression();
        String f = "1+2";
        String f2 = "((50 - ((8 - 4) * (2 + 3))) + (3 * 4))";
//        if (expr.isValidExpr(f2)) {
//            System.out.println(expr.eval(f));
//        } else {
//            System.out.println("InValidExpr");
//        }
//        ScriptEngineManager mgr = new ScriptEngineManager();
//        ScriptEngine engine = mgr.getEngineByName("JavaScript");
//        System.out.println(engine.eval(f));
       expr.evalJs(f);
    }
}
