package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:44
 * All Rights Reserved !!!
 */
public class POJOBuilderBeanTest {
    @Test
    public void whenSerializingUsingJsonPOJOBuilder_thenCorrect()
            throws IOException {
        String jsonString = "{\"id\":5,\"name\":\"POJO Builder Bean\"}";
        ObjectMapper mapper = new ObjectMapper();
        POJOBuilderBean bean = mapper.readValue(jsonString, POJOBuilderBean.class);

        assertEquals(5, bean.getIdentity());
        assertEquals("POJO Builder Bean", bean.getBeanName());
    }
}