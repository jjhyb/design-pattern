package com.yibo.designpattern.behavioral.chainofresponsibility;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 19:02
 * @Description: 批准者
 */
public abstract class Handler {

    protected Handler handler;

    public void setNextHandler(Handler handler){
        this.handler = handler;
    }

    public abstract void deploy(Course course);
}
