package com.yibo.designpattern.creational.singleton;

import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 22:28
 * @Description: 容器方式
 */
public class ContainerSingleton {
    private ContainerSingleton(){

    }

    private static Map<String,Object> singletonMap = new ConcurrentHashMap<>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isEmpty(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
