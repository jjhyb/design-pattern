package com.yibo.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 18:33
 * @Description:
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
