package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:54
 * All Rights Reserved !!!
 */
public class BeanWithCreator {
    public int id;
    public String name;

    @JsonCreator
    public BeanWithCreator(
            @JsonProperty("id") final int id,
            @JsonProperty("theName") final String name) {
        this.id = id;
        this.name = name;
    }
}
