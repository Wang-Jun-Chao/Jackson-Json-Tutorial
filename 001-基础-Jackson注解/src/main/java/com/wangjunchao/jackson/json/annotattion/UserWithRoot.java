package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:03
 * All Rights Reserved !!!
 */
@JsonRootName(value = "user")
public class UserWithRoot {
    public int id;
    public String name;

    public UserWithRoot() {
        super();
    }

    public UserWithRoot(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
}
