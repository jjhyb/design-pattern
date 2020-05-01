package com.yibo.designpattern.structural.bridge;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 18:58
 * @Description:
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
