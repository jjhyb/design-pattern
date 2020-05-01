package com.yibo.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 17:22
 * @Description:
 */
public class CourseCatalog extends CatalogComponment {
    private List<CatalogComponment> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponment catalogComponment) {
        items.add(catalogComponment);
    }

    @Override
    public void remove(CatalogComponment catalogComponment) {
        items.remove(catalogComponment);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        items.forEach(item -> {
            if(level != null){
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print("    ");
                }
            }

            item.print();
        });
    }
}
