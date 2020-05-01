package com.yibo.designpattern.structural.composite;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 17:02
 * @Description:
 */
public abstract class CatalogComponment {
    public void add(CatalogComponment catalogComponment){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponment catalogComponment){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponment catalogComponment){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponment catalogComponment){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
