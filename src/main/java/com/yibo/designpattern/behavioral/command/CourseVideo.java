package com.yibo.designpattern.behavioral.command;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 15:55
 * @Description:
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程的视频开放");
    }

    public void close(){
        System.out.println(this.name+"课程的视频关闭");
    }
}
