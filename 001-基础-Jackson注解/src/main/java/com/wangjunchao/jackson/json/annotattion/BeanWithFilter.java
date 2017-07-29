package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:34
 * All Rights Reserved !!!
 */
@JsonFilter("myFilter")
public class BeanWithFilter {
    public int id;
    public String name;

    public BeanWithFilter() {
    }

    public BeanWithFilter(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
