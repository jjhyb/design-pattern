package com.yibo.designpattern.behavioral.interpreter;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 23:17
 * @Description:
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol){
        return ("+".equals(symbol) || "*".equals(symbol));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression,Interpreter secondExpression,String symbol){
        if("+".equals(symbol)){
            return new AddInterpreter(firstExpression,secondExpression);
        }else if("*".equals(symbol)){
            return new MultiInterpreter(firstExpression,secondExpression);
        }
        return null;
    }
}
