package com.yibo.designpattern.behavioral.iterator;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 18:28
 * @Description:
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
