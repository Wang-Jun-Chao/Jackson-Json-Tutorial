package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.annotation.JsonTypeId;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:46
 * All Rights Reserved !!!
 */
public class TypeIdBean {
    private int id;
    @JsonTypeId
    private String name;

    public TypeIdBean() {
    }

    public TypeIdBean(int id, String name) {
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
