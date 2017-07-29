package com.wangjunchao.jackson.json.annotation;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:24
 * All Rights Reserved !!!
 */
public class BeanWithoutAppend {
    private int id;
    private String name;

    public BeanWithoutAppend() {
    }

    public BeanWithoutAppend(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
