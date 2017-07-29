package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:15
 * All Rights Reserved !!!
 */
public class BeanWithoutIdentityReferenceTest {
    @Test
    public void whenSerializingUsingJsonIdentityInfo_thenCorrect()
            throws JsonProcessingException {
        BeanWithoutIdentityReference bean = new BeanWithoutIdentityReference(
                1, "Bean Without Identity Reference Annotation");

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(bean);
        System.out.println(jsonString);
        assertThat(jsonString, containsString(
                "Bean Without Identity Reference Annotation"));
        assertThat(jsonString, containsString("1"));
    }


}