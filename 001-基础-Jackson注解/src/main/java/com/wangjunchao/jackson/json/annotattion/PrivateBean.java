package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:25
 * All Rights Reserved !!!
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PrivateBean {
    private int id;
    private String name;

    public PrivateBean() {
    }

    public PrivateBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
