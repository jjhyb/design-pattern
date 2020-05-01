package com.yibo.designpattern.structural.composite;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 17:05
 * @Description:
 */
public class Course extends CatalogComponment {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponment catalogComponment) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponment catalogComponment) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course name："+name+",price："+price);
    }
}
