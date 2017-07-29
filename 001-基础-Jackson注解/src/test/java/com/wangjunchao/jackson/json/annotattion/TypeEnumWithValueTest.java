package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:01
 * All Rights Reserved !!!
 */
public class TypeEnumWithValueTest {
    @Test
    public void whenSerializingUsingJsonValue_thenCorrect() throws JsonParseException, IOException {

        String enumAsString = new ObjectMapper().writeValueAsString(TypeEnumWithValue.TYPE1);
        System.out.println(enumAsString);
        assertThat(enumAsString, is("\"Type A\""));
    }
}