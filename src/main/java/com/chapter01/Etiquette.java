package com.chapter01;

/**
 * Created by jchen on 23/05/17.
 */
public class Etiquette {
    private String beforeHavingFun;

    private String afterHavingFun;

    public void beforeFun() {
        System.out.println(beforeHavingFun);
    }

    public void afterFun() {
        System.out.println(afterHavingFun);
    }

    public String getBeforeHavingFun() {
        return beforeHavingFun;
    }

    public void setBeforeHavingFun(String beforeHavingFun) {
        this.beforeHavingFun = beforeHavingFun;
    }

    public String getAfterHavingFun() {
        return afterHavingFun;
    }

    public void setAfterHavingFun(String afterHavingFun) {
        this.afterHavingFun = afterHavingFun;
    }
}
