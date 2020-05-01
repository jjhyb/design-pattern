package com.yibo.designpattern.behavioral.mediator;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 18:06
 * @Description:
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }
}
