package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:05
 * All Rights Reserved !!!
 */
public class UserWithRootTest {
    @Test
    public void whenSerializingUsingJsonRootName_thenCorrect()
            throws JsonProcessingException {

        UserWithRoot user = new UserWithRoot(1, "John");

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = mapper.writeValueAsString(user);
        System.out.println(result);
        assertThat(result, containsString("John"));
        assertThat(result, containsString("user"));
    }
}