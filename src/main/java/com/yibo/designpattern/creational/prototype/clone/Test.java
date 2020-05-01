package com.yibo.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 18:28
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("小猪",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1.getBirthday() == pig2.getBirthday());
    }
}
