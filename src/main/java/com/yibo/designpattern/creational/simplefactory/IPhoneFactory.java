package com.yibo.designpattern.creational.simplefactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 16:57
 * @Description:
 */
public class IPhoneFactory {

    public static IPhone createPhone(String model){
        if("IphoneX".equalsIgnoreCase(model)){
            return new IphoneX();
        }else if("IphoneXs".equalsIgnoreCase(model)){
            return new IphoneXs();
        }
        return null;
    }

    public IPhone getPhone(Class clazz){
        IPhone iPhone = null;
        try {
            iPhone = (IPhone) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iPhone;
    }
}
