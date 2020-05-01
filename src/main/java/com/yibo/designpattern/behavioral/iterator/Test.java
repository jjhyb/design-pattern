package com.yibo.designpattern.behavioral.iterator;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 18:42
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Spring课程");
        Course course2 = new Course("SpringBoot课程");
        Course course3 = new Course("SpringCloud课程");
        Course course4 = new Course("Netty课程");
        Course course5 = new Course("RocketMQ课程");
        Course course6 = new Course("MySQL课程");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("------------课程列表------------");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);
        System.out.println("------------删除操作完成之后的课程列表------------");
        printCourses(courseAggregate);

    }

    private static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
