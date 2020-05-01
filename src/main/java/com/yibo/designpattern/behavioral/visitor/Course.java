package com.yibo.designpattern.behavioral.visitor;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 21:34
 * @Description:
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);
}
