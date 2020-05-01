package com.yibo.designpattern.structural.flyweight;

import java.util.Random;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 1:22
 * @Description:
 */
public class Test {
    private static final String[] departments = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[new Random().nextInt(departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
