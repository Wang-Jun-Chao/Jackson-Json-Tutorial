package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:43
 * All Rights Reserved !!!
 */
@JsonPOJOBuilder(buildMethodName = "createBean", withPrefix = "construct")
public class BeanBuilder {
    private int idValue;
    private String nameValue;

    public BeanBuilder constructId(int id) {
        idValue = id;
        return this;
    }

    public BeanBuilder constructName(String name) {
        nameValue = name;
        return this;
    }

    public POJOBuilderBean createBean() {
        return new POJOBuilderBean(idValue, nameValue);
    }
}
