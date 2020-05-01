package com.yibo.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 18:28
 * @Description: 饿汉式
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){
        if(singleton != null){
            throw new RuntimeException("单例构造函数禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }
}
