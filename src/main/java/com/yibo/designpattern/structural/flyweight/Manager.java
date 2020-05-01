package com.yibo.designpattern.structural.flyweight;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 1:15
 * @Description:
 */
public class Manager implements Employee {

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(this.reportContent);
    }
}
