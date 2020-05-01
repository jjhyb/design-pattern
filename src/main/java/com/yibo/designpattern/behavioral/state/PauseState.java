package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:52
 * @Description:
 */
public class PauseState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
        super.videoContext.getVideoState().play();
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
        super.videoContext.getVideoState().speed();
    }

    @Override
    public void pause() {
        super.setName("暂停状态");
        System.out.println("暂停播放视频");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
        super.videoContext.getVideoState().stop();
    }
}
