package com.yibo.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:16
 * @Description:
 */
public class ObjectStructure {

    private List<Course> courseList = new ArrayList<>();

    public void accept(Visitor visitor){
        courseList.forEach(course -> course.accept(visitor));
    }

    public void add(Course course){
        courseList.add(course);
    }

    public void remove(Course course){
        courseList.remove(course);
    }
}
