package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:27
 * All Rights Reserved !!!
 */
public class Zoo {
    public Animal animal;

    public Zoo() {
    }

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
    })
    public static class Animal {
        public String name;
    }

    @JsonTypeName("dog")
    public static class Dog extends Animal {
        public double barkVolume;

        public Dog() {
        }

        public Dog(String name) {
            this.name = name;
        }
    }

    @JsonTypeName("cat")
    public static class Cat extends Animal {
        boolean likesCream;
        public int lives;
    }
}
