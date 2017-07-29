package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:32
 * All Rights Reserved !!!
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class NamingBean {
    private int id;
    private String beanName;

    public NamingBean() {
    }

    public NamingBean(int id, String beanName) {
        this.id = id;
        this.beanName = beanName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
