package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:35
 * All Rights Reserved !!!
 */
public class PropertyDescriptionBean {
    private int id;
    @JsonPropertyDescription("This is a description of the name property")
    private String name;

    public PropertyDescriptionBean() {
    }

    public PropertyDescriptionBean(int id, String name) {
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
