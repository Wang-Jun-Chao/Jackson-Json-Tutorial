package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:38
 * All Rights Reserved !!!
 */
public class BeanWithCustomAnnotationTest {
    @Test
    public void whenSerializingUsingCustomAnnotation_thenCorrect()
            throws JsonProcessingException {
        BeanWithCustomAnnotation bean = new BeanWithCustomAnnotation(1, "My bean", null);

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));
        assertThat(result, not(containsString("dateCreated")));
    }
}