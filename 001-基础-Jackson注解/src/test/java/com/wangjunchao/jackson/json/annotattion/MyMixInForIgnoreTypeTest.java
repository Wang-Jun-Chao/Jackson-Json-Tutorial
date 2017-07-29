package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:42
 * All Rights Reserved !!!
 */
public class MyMixInForIgnoreTypeTest {
    @Test
    public void whenSerializingUsingMixInAnnotation_thenCorrect()
            throws JsonProcessingException {
        Item2 item = new Item2(1, "book", null);

        String result = new ObjectMapper().writeValueAsString(item);
        System.out.println(result);
        assertThat(result, containsString("owner"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(User.class, MyMixInForIgnoreType.class);

        result = mapper.writeValueAsString(item);
        System.out.println(result);
        assertThat(result, not(containsString("owner")));
    }
}