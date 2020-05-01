package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:52
 * @Description:
 */
public class SpeedState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
        super.videoContext.getVideoState().play();
    }

    @Override
    public void speed() {
        super.setName("快进状态");
        System.out.println("快进播放视频");
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
