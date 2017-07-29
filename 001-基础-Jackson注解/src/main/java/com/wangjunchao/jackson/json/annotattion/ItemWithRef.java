package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:48
 * All Rights Reserved !!!
 */
public class ItemWithRef {
    public int id;
    public String itemName;

    @JsonManagedReference
    public UserWithRef owner;

    public ItemWithRef() {
    }

    public ItemWithRef(int id, String itemName, UserWithRef owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
