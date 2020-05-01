package com.yibo.designpattern.behavioral.interpreter;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 22:22
 * @Description:
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret()*this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
