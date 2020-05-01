package com.yibo.designpattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 19:07
 * @Description:
 */
public class VideoHandler extends Handler {
    @Override
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getVideo())){
            System.out.println(course.getName()+"课程包含video，批准");
            if(handler != null){
                handler.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"课程不包含video，不批准，流程结束");
            return;
        }
    }
}
