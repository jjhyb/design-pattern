package com.yibo.designpattern.creational.singleton;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 17:44
 * @Description: Double-Check 双重加锁机制
 */
public class LazyDoubleCheckSingleton {

    public volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        //先判断是否存在，不存在再加锁处理
        if(singleton == null){
            //在同一个时刻加了锁的那部分程序只有一个线程可以进入
            synchronized (LazyDoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new LazyDoubleCheckSingleton();
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、设置singleton指向刚分配的内存地址
                    //singleton利用volatile关键字防止指令重排序
                }
            }
        }
        return singleton;
    }
}
