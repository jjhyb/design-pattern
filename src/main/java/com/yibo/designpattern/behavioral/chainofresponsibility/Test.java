package com.yibo.designpattern.behavioral.chainofresponsibility;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 19:12
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Handler articleHandler = new ArticleHandler();
        Handler videoHandler = new VideoHandler();

        Course course = new Course();
        course.setName("Pulsar精讲");
        course.setArticle("Pulsar的博客");
        course.setVideo("Pulsar的视频");

        articleHandler.setNextHandler(videoHandler);
        articleHandler.deploy(course);
    }
}
