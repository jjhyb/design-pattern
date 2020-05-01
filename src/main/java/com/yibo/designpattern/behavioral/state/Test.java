package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 23:10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext();
        videoContext.setVideoState(new PlayState());
        videoContext.play();
        System.out.println("当前状态："+videoContext.getVideoState().getName());

        videoContext.speed();
        System.out.println("当前状态："+videoContext.getVideoState().getName());

        videoContext.pause();
        System.out.println("当前状态："+videoContext.getVideoState().getName());

        videoContext.stop();
        System.out.println("当前状态："+videoContext.getVideoState().getName());
    }
}
