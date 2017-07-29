package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:49
 * All Rights Reserved !!!
 */
public class UserWithRef {
    public int id;
    public String name;

    @JsonBackReference
    public List<ItemWithRef> userItems = Lists.newArrayList();

    public UserWithRef() {
    }

    public UserWithRef(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addItem(ItemWithRef item) {
        userItems.add(item);
    }
}
