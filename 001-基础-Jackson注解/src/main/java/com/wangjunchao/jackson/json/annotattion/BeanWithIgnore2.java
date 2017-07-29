package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:17
 * All Rights Reserved !!!
 */
public class BeanWithIgnore2 {
    @JsonIgnore
    public int id;
    public String name;

    public BeanWithIgnore2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
