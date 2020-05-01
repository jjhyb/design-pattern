package com.yibo.designpattern.behavioral.visitor;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 21:37
 * @Description:
 */
public interface Visitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
