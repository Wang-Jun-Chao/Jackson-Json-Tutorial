package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:58
 * All Rights Reserved !!!
 */
public class RawBeanTest {
    @Test
    public void whenSerializingUsingJsonRawValue_thenCorrect()
            throws JsonProcessingException {

        RawBean bean = new RawBean("My bean", "{\"attr\":false}");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("{\"attr\":false}"));
    }
}