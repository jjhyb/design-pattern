package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:52
 * @Description:
 */
public class PlayState extends VideoState {
    @Override
    public void play() {
        super.setName("播放状态");
        System.out.println("正常播放视频");
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
        super.videoContext.getVideoState().speed();
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
        super.videoContext.getVideoState().pause();
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
        super.videoContext.getVideoState().stop();
    }
}
