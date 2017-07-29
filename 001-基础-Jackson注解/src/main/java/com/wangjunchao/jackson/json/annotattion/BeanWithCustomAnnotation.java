package com.wangjunchao.jackson.json.annotattion;

import java.util.Date;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:38
 * All Rights Reserved !!!
 */
@CustomAnnotation
public class BeanWithCustomAnnotation {
    public int id;
    public String name;
    public Date dateCreated;

    public BeanWithCustomAnnotation() {
    }

    public BeanWithCustomAnnotation(int id, String name, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }
}
