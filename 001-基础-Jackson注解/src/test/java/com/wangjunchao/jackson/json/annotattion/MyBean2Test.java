package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:23
 * All Rights Reserved !!!
 */
public class MyBean2Test {
    @Test
    public void whenSerializingUsingJsonInclude_thenCorrect()
            throws JsonProcessingException {

        MyBean2 bean = new MyBean2(1, null);

        String result = new ObjectMapper()
                .writeValueAsString(bean);
        System.out.println(result);
        assertThat(result, containsString("1"));
        assertThat(result, not(containsString("name")));
    }
}