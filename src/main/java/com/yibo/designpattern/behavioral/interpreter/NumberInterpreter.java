package com.yibo.designpattern.behavioral.interpreter;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 22:30
 * @Description:
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
