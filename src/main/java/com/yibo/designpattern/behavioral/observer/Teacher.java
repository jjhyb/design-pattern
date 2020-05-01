package com.yibo.designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: huangyibo
 * @Date: 2020/4/28 0:31
 * @Description:
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable observable, Object arg) {
        Course course = (Course)observable;
        Question question = (Question)arg;

        //如果业务罗复杂，或者并发量大，这里需要进行异步操作，将消息放入消息队列中进行处理
        System.out.println(this.teacherName+"老师的"+course.getCourseName()
                + "课程接收到一个"+question.getUsername()+"提交的问答："
                + question.getQuestionContent());
    }
}
