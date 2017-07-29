package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JacksonInject;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:57
 * All Rights Reserved !!!
 */
public class BeanWithInject {
    @JacksonInject
    public int id;

    public String name;

    @Override
    public String toString() {
        return "{" + "\"id\":" + id + ", \"name\":\"" + name + "\"}";
    }
}
