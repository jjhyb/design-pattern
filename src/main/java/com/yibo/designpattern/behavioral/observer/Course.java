package com.yibo.designpattern.behavioral.observer;

import java.util.Observable;

/**
 * @author: huangyibo
 * @Date: 2020/4/28 0:28
 * @Description:
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUsername()+"在"+course.courseName+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
