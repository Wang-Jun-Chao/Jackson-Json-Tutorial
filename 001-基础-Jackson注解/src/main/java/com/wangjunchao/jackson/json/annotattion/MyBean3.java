package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:53
 * All Rights Reserved !!!
 */
public class MyBean3 {
    public int id;
    private String name;

    public MyBean3() {
    }

    public MyBean3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty("name")
    public void setTheName(String name) {
        this.name = name;
    }

    @JsonProperty("name")
    public String getTheName() {
        return name;
    }
}
