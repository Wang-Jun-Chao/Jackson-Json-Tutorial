package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:42
 * All Rights Reserved !!!
 */
public class Item2 {
    public int id;
    public String itemName;
    public User owner;

    public Item2() {
    }

    public Item2(int id, String itemName, User owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
