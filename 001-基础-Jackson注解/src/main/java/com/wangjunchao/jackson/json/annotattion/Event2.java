package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:06
 * All Rights Reserved !!!
 */
public class Event2 {
    public String name;

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd HH:mm:ss")
    public Date eventDate;
}
