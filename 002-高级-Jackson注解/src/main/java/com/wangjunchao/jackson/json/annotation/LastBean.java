package com.wangjunchao.jackson.json.annotation;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:51
 * All Rights Reserved !!!
 */
public class LastBean extends AbstractBean {
    String firstName;

    public LastBean() {
    }

    public LastBean(int id, String name) {
        super(id);
        setFirstName(name);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
