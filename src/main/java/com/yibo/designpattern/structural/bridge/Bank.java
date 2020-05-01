package com.yibo.designpattern.structural.bridge;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 18:55
 * @Description:
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();
}
