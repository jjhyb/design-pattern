package com.yibo.designpattern.creational.singleton;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 20:51
 * @Description: 枚举方式
 */
public enum EnumInstance {
    INSTANCE{
        protected void print(){
            System.out.println("print test");
        }
    };

    //通过声明抽象方法去调用INSTANCE里面的方法
    protected abstract void print();

    //实例变量
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
