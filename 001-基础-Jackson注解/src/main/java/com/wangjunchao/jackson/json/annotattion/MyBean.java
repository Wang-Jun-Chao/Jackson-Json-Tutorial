package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:53
 * All Rights Reserved !!!
 */
@JsonPropertyOrder({"name", "id"})
public class MyBean {
    public int id;
    private String name;

    public MyBean() {
    }

    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonGetter("name")
    public String getTheName() {
        return name;
    }

    @JsonSetter("name")
    public void setTheName(String name) {
        this.name = name;
    }
}
