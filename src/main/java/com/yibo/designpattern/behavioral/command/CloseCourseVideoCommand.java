package com.yibo.designpattern.behavioral.command;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 15:57
 * @Description:
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        this.courseVideo.close();
    }
}
