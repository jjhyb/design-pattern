package com.yibo.designpattern.structural.bridge;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 18:59
 * @Description:
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
