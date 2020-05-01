package com.yibo.designpattern.creational.singleton;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 17:26
 * @Description: 懒汉式
 */
public class LazySingleton {

    public static LazySingleton singleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        synchronized (LazySingleton.class){
            if(singleton == null){
                singleton = new LazySingleton();
            }
        }
        return singleton;
    }
}
