package com.yibo.designpattern.behavioral.observer;

/**
 * @author: huangyibo
 * @Date: 2020/4/28 0:46
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("相对论");
        Teacher teacher = new Teacher("爱因斯坦");

        course.addObserver(teacher);

        //业务逻辑代码
        Question question = new Question();
        question.setUsername("Alpha");
        question.setQuestionContent("怎样才能超过光速");

        course.produceQuestion(course,question);
    }
}
