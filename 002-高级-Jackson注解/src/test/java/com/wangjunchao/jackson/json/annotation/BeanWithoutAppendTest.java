package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:26
 * All Rights Reserved !!!
 */
public class BeanWithoutAppendTest {
    @Test
    public void whenSerializingWithoutJsonJsonAppend_thenCorrect()
            throws JsonProcessingException {
        BeanWithoutAppend bean = new BeanWithoutAppend(
                2, "Bean Without Append Annotation");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writerFor(BeanWithoutAppend.class)
                .withAttribute("version", "1.0");
        String jsonString = writer.writeValueAsString(bean);
        System.out.println(jsonString);

        assertThat(jsonString, containsString("2"));
        assertThat(jsonString, containsString("Bean Without Append Annotation"));
        assertThat(jsonString, not(containsString("1.0")));
    }
}