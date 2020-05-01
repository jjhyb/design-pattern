package com.yibo.designpattern.behavioral.templatemethod;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 0:52
 * @Description:
 */
public class SpringCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
