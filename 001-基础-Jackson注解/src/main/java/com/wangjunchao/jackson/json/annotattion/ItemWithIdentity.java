package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:04
 * All Rights Reserved !!!
 */
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class ItemWithIdentity {
    public int id;
    public String itemName;
    public UserWithIdentity owner;

    public ItemWithIdentity() {
    }

    public ItemWithIdentity(int id, String itemName, UserWithIdentity owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
