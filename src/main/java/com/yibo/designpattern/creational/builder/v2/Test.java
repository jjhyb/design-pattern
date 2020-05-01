package com.yibo.designpattern.creational.builder.v2;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 1:33
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java并发编程")
                .buildCoursePPT("java并发编程PPT").buildCourseVideo("java并发编程Video")
                .buildCourseArticle("java并发编程博客").buildCourseQA("java并发编程问答").build();
        System.out.println(course);
    }
}
