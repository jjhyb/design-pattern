package com.yibo.designpattern.behavioral.templatemethod;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 0:54
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Spring课程start------");
        ACourse springCourse = new SpringCourse();
        springCourse.makeCourse();
        System.out.println("Spring课程end------");

        System.out.println("前端课程start------");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端课程end------");
    }
}
