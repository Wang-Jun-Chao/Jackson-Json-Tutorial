package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:42
 * All Rights Reserved !!!
 */
public class Item {
    @JsonView(Views.Public.class)
    public int id;

    @JsonView(Views.Public.class)
    public String itemName;

    @JsonView(Views.Internal.class)
    public String ownerName;

    public Item() {
    }

    public Item(int id, String itemName, String ownerName) {
        this.id = id;
        this.itemName = itemName;
        this.ownerName = ownerName;
    }
}
