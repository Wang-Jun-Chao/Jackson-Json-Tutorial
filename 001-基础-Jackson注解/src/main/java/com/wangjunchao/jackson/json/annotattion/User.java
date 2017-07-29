package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:20
 * All Rights Reserved !!!
 */
public class User {
    public int id;
    public Name name;

    public User() {
    }

    public User(int id, Name name) {
        this.id = id;
        this.name = name;
    }

    @JsonIgnoreType
    public static class Name {
        public String firstName;
        public String lastName;

        public Name() {
        }

        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
