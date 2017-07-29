package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:34
 * All Rights Reserved !!!
 */
public class MyBean3Test {
    @Test
    public void whenUsingJsonProperty_thenCorrect()
            throws IOException {
        MyBean3 bean = new MyBean3(1, "My bean");

        String result = new ObjectMapper().writeValueAsString(bean);

        System.out.println(result);
        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));


        MyBean3 resultBean = new ObjectMapper()
                .readerFor(MyBean3.class)
                .readValue(result);
        assertEquals("My bean", resultBean.getTheName());
    }
}