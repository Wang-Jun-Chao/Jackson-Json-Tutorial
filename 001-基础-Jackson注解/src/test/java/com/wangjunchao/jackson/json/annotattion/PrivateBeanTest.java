package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:25
 * All Rights Reserved !!!
 */
public class PrivateBeanTest {
    @Test
    public void whenSerializingUsingJsonAutoDetect_thenCorrect()
            throws JsonProcessingException {

        PrivateBean bean = new PrivateBean(1, "My bean");

        String result = new ObjectMapper()
                .writeValueAsString(bean);

        System.out.println(result);
        assertThat(result, containsString("1"));
        assertThat(result, containsString("My bean"));
    }
}