package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:52
 * @Description:
 */
public class StopState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
        super.videoContext.getVideoState().play();
    }

    @Override
    public void speed() {
        System.out.println("error 视频停止状态不能快进!!");
    }

    @Override
    public void pause() {
        System.out.println("error 视频停止状态不能暂停!!");
    }

    @Override
    public void stop() {
        super.setName("停止状态");
        System.out.println("停止播放视频");
    }
}
