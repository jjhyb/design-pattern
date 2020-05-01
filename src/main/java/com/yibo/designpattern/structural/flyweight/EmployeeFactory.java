package com.yibo.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 1:18
 * @Description:
 */
public class EmployeeFactory {

    private static final Map<String,Employee> map = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) map.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.println("创建部门经理："+department);
            String reportContent = department + "，部门汇报：此次汇报的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println("创建报告："+reportContent);
            map.put(department,manager);
        }
        return manager;
    }
}
