package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:42
 * All Rights Reserved !!!
 */
@JsonDeserialize(builder = BeanBuilder.class)
public class POJOBuilderBean {
    private int identity;
    private String beanName;

    public POJOBuilderBean() {
    }

    public POJOBuilderBean(int identity, String beanName) {
        this.identity = identity;
        this.beanName = beanName;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
