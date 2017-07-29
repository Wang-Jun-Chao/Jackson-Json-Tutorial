package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:15
 * All Rights Reserved !!!
 */
@JsonIgnoreProperties({"id"})
public class BeanWithIgnore {
    public int id;
    public String name;

    public BeanWithIgnore(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
