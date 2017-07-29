package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:06
 * All Rights Reserved !!!
 */
public class Event {
    public String name;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date eventDate;

    public Event() {
    }

    public Event(String name, Date eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }



}
