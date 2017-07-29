package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:53
 * All Rights Reserved !!!
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "id" })
public class MyBean4 {
    public int id;
    private String name;

    public MyBean4() {
    }

    public MyBean4(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
