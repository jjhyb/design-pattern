package com.yibo.designpattern.behavioral.command;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 15:56
 * @Description:
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        this.courseVideo.open();
    }
}
