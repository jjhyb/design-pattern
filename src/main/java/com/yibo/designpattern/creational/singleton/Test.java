package com.yibo.designpattern.creational.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: huangyibo
 * @Date: 2020/4/6 18:37
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //对单例模式进行序列化和反序列化破坏
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SINGLETON_FILE"));
//
//        oos.writeObject(instance);
//
//        File file = new File("SINGLETON_FILE");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        //反射破坏单例模式
//        Class clazz = HungrySingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton newInstance = (HungrySingleton)constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SINGLETON_FILE"));

        oos.writeObject(instance);

        File file = new File("SINGLETON_FILE");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance)ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
