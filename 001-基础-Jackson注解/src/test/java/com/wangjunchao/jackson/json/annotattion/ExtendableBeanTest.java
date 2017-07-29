package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 07:45
 * All Rights Reserved !!!
 */
public class ExtendableBeanTest {
    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws JsonProcessingException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
        assertThat(result, containsString("attr1"));
        assertThat(result, containsString("val1"));
    }

    @Test
    public void whenDeserializingUsingJsonAnySetter_thenCorrect()
            throws IOException {
        String json
                = "{\"name\":\"My bean\",\"attr2\":\"val2\",\"attr1\":\"val1\"}";

        ExtendableBean bean = new ObjectMapper()
                .readerFor(ExtendableBean.class)
                .readValue(json);

        assertEquals("My bean", bean.getName());
        assertEquals("val2", bean.getProperties().get("attr2"));
    }
}