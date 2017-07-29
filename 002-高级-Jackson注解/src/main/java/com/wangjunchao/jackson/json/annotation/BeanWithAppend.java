package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:29
 * All Rights Reserved !!!
 */
@JsonAppend(attrs = {@JsonAppend.Attr(value = "version")})
public class BeanWithAppend {
    private int id;
    private String name;

    public BeanWithAppend() {
    }

    public BeanWithAppend(int id, String name) {
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
