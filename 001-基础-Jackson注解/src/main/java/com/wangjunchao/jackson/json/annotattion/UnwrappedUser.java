package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:40
 * All Rights Reserved !!!
 */
public class UnwrappedUser {
    public int id;

    @JsonUnwrapped
    public Name name;

    public UnwrappedUser() {
    }

    public UnwrappedUser(int id, Name name) {
        this.id = id;
        this.name = name;
    }

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
