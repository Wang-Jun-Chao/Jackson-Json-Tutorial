package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:38
 * All Rights Reserved !!!
 */
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "id", "dateCreated"})
public @interface CustomAnnotation {
}
