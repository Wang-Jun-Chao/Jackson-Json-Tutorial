package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:50
 * All Rights Reserved !!!
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type"
)
@JsonTypeIdResolver(BeanIdResolver.class)
public class AbstractBean {
    private int id;

    public AbstractBean() {
    }

    protected AbstractBean(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}