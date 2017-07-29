package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:33
 * All Rights Reserved !!!
 */
public class NamingBeanTest {
    @Test
    public void whenSerializingUsingJsonNaming_thenCorrect()
            throws JsonProcessingException {
        NamingBean bean = new NamingBean(3, "Naming Bean");
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(bean);
        System.out.println(jsonString);
        assertThat(jsonString, containsString("bean_name"));
    }
}