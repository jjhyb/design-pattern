package com.yibo.designpattern.behavioral.visitor;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 21:40
 * @Description:
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        //访问免费课程，打印所有的免费课程名称
        System.out.println("免费课程："+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        //访问收费课程，打印所有的收费课程名称及价格
        System.out.println("收费课程："+codingCourse.getName()+"，价格："+codingCourse.getPrice());
    }
}
