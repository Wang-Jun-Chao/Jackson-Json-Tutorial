package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.text.ParseException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:21
 * All Rights Reserved !!!
 */
public class UserTest {
    @Test
    public void whenSerializingUsingJsonIgnoreType_thenCorrect()
            throws JsonProcessingException, ParseException {

        User.Name name = new User.Name("John", "Doe");
        User user = new User(1, name);

        String result = new ObjectMapper()
                .writeValueAsString(user);
        System.out.println(result);
        assertThat(result, containsString("1"));
        assertThat(result, not(containsString("name")));
        assertThat(result, not(containsString("John")));
    }
}