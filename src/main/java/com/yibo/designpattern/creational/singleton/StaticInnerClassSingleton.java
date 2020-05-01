package com.yibo.designpattern.creational.singleton;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 18:02
 * @Description: 静态内部类方式
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){

    }

    private static class InnerClass {
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }
}
