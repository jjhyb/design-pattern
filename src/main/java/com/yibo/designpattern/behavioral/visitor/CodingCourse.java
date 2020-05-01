package com.yibo.designpattern.behavioral.visitor;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 21:36
 * @Description:
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
