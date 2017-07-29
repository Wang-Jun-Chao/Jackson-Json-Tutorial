package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:48
 * All Rights Reserved !!!
 */
public class TypeIdBeanTest {
    @Test
    public void whenSerializingUsingJsonTypeId_thenCorrect()
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        TypeIdBean bean = new TypeIdBean(6, "Type Id Bean");
        String jsonString = mapper.writeValueAsString(bean);
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Type Id Bean"));
    }
}