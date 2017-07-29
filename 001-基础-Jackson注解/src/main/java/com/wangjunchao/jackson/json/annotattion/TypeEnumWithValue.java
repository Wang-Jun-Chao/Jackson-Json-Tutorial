package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:00
 * All Rights Reserved !!!
 */
public enum TypeEnumWithValue {
    TYPE1(1, "Type A"), TYPE2(2, "Type 2");

    private Integer id;
    private String name;

    TypeEnumWithValue(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
