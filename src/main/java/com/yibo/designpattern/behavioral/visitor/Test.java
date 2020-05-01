package com.yibo.designpattern.behavioral.visitor;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 21:43
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Spring课程");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("SpringBoot课程");
        codingCourse.setPrice(399);

        objectStructure.add(freeCourse);
        objectStructure.add(codingCourse);

        objectStructure.accept(new VisitorImpl());
    }
}
