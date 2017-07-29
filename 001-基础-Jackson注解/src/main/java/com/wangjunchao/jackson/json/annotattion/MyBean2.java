package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:53
 * All Rights Reserved !!!
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyBean2 {
    public int id;
    private String name;

    public MyBean2() {
    }

    public MyBean2(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
