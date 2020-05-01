package com.yibo.designpattern.creational.builder;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 1:16
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java并发编程", "java并发编程PPT",
                "java并发编程Video", "java并发编程博客", "java并发编程问答");
        System.out.println(course);
    }
}
