package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:41
 * All Rights Reserved !!!
 */
public class ExtendableBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private Map<String, String> properties;

    public ExtendableBean() {
        properties = new HashMap<String, String>();
    }

    public ExtendableBean(final String name) {
        this.name = name;
        properties = new HashMap<String, String>();
    }

    @JsonAnySetter
    public void add(final String key, final String value) {
        properties.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }
}
