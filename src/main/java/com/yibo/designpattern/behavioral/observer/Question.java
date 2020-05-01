package com.yibo.designpattern.behavioral.observer;

/**
 * @author: huangyibo
 * @Date: 2020/4/28 0:30
 * @Description:
 */
public class Question {

    private String username;

    private String questionContent;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
