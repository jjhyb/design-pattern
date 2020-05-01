package com.yibo.designpattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 19:04
 * @Description:
 */
public class ArticleHandler extends Handler {
    @Override
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+"课程包含article，批准");
            if(handler != null){
                handler.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"课程不包含article，不批准，流程结束");
            return;
        }
    }
}
