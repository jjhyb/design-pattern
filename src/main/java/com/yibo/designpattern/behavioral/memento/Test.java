package com.yibo.designpattern.behavioral.memento;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 1:51
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("Spring","Spring内容","Spring图片");

        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题："+article.getTitle()+"，内容："+article.getContent()+"，图片："+article.getImgs());

        System.out.println("课程完整信息："+article);

        System.out.println("修改start......");
        article.setTitle("SpringBoot");
        article.setContent("SpringBoot内容");
        article.setImgs("SpringBoot图片");
        System.out.println("修改end......");

        System.out.println("课程完整信息："+article);
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("SpringCloud");
        article.setContent("SpringCloud内容");
        article.setImgs("SpringCloud图片");

        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("课程完整信息："+article);
    }
}
