package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:13
 * All Rights Reserved !!!
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BeanWithoutIdentityReference {
    private int id;
    private String name;

    public BeanWithoutIdentityReference() {
    }

    public BeanWithoutIdentityReference(int id, String name) {
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
