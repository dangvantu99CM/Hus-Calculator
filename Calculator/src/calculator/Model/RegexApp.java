/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.Model;

import java.util.*;

/**
 *
 * @author tudv
 */
public class RegexApp {

    // check % charactor
    static final String regex_percent = "([0-9|.|0-9]+%)";
    //check sin
    static final String regex_sin = "(sin\\([0-9|+|-|*|/|.|!|%]+\\))";
    //check cos
    static final String regex_cos = "(cos\\([0-9|+|-|*|/|.|!|%]+\\))";
    // check tan
    static final String regex_tan = "(tan\\([0-9|+|-|*|/|.|!|%]+\\))";
    // check x!
  //  static final String regex_factorial = "(\\(?[0-9|.|0-9|+|-|*|/]+\\)?!)";
    static final String regex_factorial = "([0-9|.|0-9]+!)";
    // check x^y
    static final String regex_exponential = "([[0-9|.|0-9]+^[0-9|.|0-9]+])";
    // check sqrt
    static final String regex_sqrt = "(sqrt\\([0-9|+|-|*|/|.|!|%]+\\))";
    // check log
    static final String regex_ln = "(ln\\([0-9|+|-|*|/|.|!|%]+\\))";
    // check log
    static final String regex_log = "(log\\([0-9|+|-|*|/|.|!|%]+\\))";

    static final String sub_regex_sin = "sin\\((.*)\\)";
    static final String sub_regex_cos= "cos\\((.*)\\)";
    static final String sub_regex_tan = "tan\\((.*)\\)";
    static final String sub_regex_factorial = "(\\(?[0-9|.|0-9|+|-|*|/]+\\)?)";
    static final String sub_regex_percent = "([0-9|.|0-9]+)";
    static final String sub_regex_log = "log\\((.*)\\)";
    static final String sub_regex_ln = "ln\\((.*)\\)";
    static final String sub_regex_sqrt = "sqrt\\((.*)\\)";

    static final int _percent = 0;
    static final int _factorial = 1;
    static final int _sin = 2;
    static final int _cos = 3;
    static final int _tan = 4;
    static final int _ln = 5;
    static final int _sqrt = 6;
    static final int _log = 7;
    

}
