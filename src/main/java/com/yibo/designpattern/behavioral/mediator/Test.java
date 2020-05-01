package com.yibo.designpattern.behavioral.mediator;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 18:10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        User user1 = new User("小明");
        User user2 = new User("张三");

        user1.sendMessage("hello 张三，很高兴认识你");
        user2.sendMessage("hello 小明，我也一样");
    }
}
