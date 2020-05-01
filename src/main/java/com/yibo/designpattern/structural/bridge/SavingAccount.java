package com.yibo.designpattern.structural.bridge;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 18:51
 * @Description:
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
