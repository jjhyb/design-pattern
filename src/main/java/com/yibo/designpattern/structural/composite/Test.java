package com.yibo.designpattern.structural.composite;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 17:45
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponment linuxCourse = new Course("Linux课程",20);
        CatalogComponment windowsCourse = new Course("windows课程",30);

        CatalogComponment javaCourseCatalog = new CourseCatalog("java课程目录",2);
        CatalogComponment springCourse = new Course("Spring课程",30);
        CatalogComponment springBootCourse = new Course("SpringBoot课程",40);
        CatalogComponment springCloudCourse = new Course("SpringCloud课程",50);
        javaCourseCatalog.add(springCourse);
        javaCourseCatalog.add(springBootCourse);
        javaCourseCatalog.add(springCloudCourse);

        CatalogComponment mainCourseCatalog = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }
}
