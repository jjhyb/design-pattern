package com.yibo.designpattern.behavioral.memento;

import java.util.Stack;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 1:42
 * @Description:
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> articleMementoStack = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = articleMementoStack.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        articleMementoStack.push(articleMemento);
    }
}
