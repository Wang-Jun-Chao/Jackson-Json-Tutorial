package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:01
 * All Rights Reserved !!!
 */
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class UserWithIdentity {
    public int id;
    public String name;
    public List<ItemWithIdentity> userItems = Lists.newArrayList();

    public UserWithIdentity() {
    }

    public UserWithIdentity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addItem(ItemWithIdentity item) {
        userItems.add(item);
    }
}
