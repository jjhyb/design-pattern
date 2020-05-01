package com.yibo.designpattern.behavioral.mediator;

import java.util.Date;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 18:05
 * @Description:
 */
public class StudyGroup {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+"["+user.getName()+"]："+message);
    }
}
