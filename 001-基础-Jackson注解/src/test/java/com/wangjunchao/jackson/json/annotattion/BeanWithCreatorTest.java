package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:55
 * All Rights Reserved !!!
 */
public class BeanWithCreatorTest {
    @Test
    public void whenDeserializingUsingJsonCreator_thenCorrect()
            throws IOException {

        String json = "{\"id\":1,\"theName\":\"My bean\"}";

        BeanWithCreator bean = new ObjectMapper()
                .readerFor(BeanWithCreator.class)
                .readValue(json);
        assertEquals("My bean", bean.name);
    }
}