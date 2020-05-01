package com.yibo.designpattern.creational.singleton;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 22:46
 * @Description: 保证同一线程拿到的是同一个实例
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocal.get();
    }
}
