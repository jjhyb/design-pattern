package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:48
 * @Description:
 */
public abstract class VideoState {

    protected VideoContext videoContext;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    //播放状态
    public abstract void play();

    //快进状态
    public abstract void speed();

    //暂停状态
    public abstract void pause();

    //停止状态
    public abstract void stop();
}
