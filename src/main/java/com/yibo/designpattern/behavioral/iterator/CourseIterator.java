package com.yibo.designpattern.behavioral.iterator;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 18:32
 * @Description:
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
