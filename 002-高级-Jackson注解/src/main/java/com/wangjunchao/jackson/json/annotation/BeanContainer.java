package com.wangjunchao.jackson.json.annotation;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:52
 * All Rights Reserved !!!
 */
public class BeanContainer {
    private List<AbstractBean> beans;

    public List<AbstractBean> getBeans() {
        return beans;
    }

    public void setBeans(List<AbstractBean> beans) {
        this.beans = beans;
    }
}
