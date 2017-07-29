package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:25
 * All Rights Reserved !!!
 */
public class BeanWithIdentityReferenceTest {
    @Test
    public void whenSerializingUsingJsonIdentityInfoWithJsonIdentityReference_thenCorrect()
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        BeanWithIdentityReference bean = new BeanWithIdentityReference(
                1, "Bean With Identity Reference Annotation");
        String jsonString = mapper.writeValueAsString(bean);
        System.out.println(1);
        assertEquals("1", jsonString);
    }
}