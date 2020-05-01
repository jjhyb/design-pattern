package com.yibo.designpattern.behavioral.state;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 22:49
 * @Description:
 */
public class VideoContext {

    private VideoState videoState;

    public static final PlayState PLAY_STATE = new PlayState();
    public static final SpeedState SPEED_STATE = new SpeedState();
    public static final PauseState PAUSE_STATE = new PauseState();
    public static final StopState STOP_STATE = new StopState();

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setCourseVideoContext(this);
    }

    //播放状态
    public void play(){
        this.videoState.play();
    }

    //快进状态
    public void speed(){
        this.videoState.speed();
    }

    //暂停状态
    public void pause(){
        this.videoState.pause();
    }

    //停止状态
    public void stop(){
        this.videoState.stop();
    }
}
