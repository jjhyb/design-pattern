package com.yibo.designpattern.behavioral.visitor;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 21:38
 * @Description:
 */
public class FreeCourse extends Course {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
