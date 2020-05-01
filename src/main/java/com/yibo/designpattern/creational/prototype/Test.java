package com.yibo.designpattern.creational.prototype;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 17:36
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail)mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@yibo.com");
            mailTemp.setContent("恭喜此次活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
