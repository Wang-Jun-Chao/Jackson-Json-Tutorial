package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:57
 * All Rights Reserved !!!
 */
public class RawBean {

    public String name;

    @JsonRawValue
    public String json;

    public RawBean() {
    }

    public RawBean(String name, String json) {
        this.name = name;
        this.json = json;
    }

}
