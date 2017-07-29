package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 10:45
 * All Rights Reserved !!!
 */
public class MyBean4Test {
    @Test
    public void whenDisablingAllAnnotations_thenAllDisabled()
            throws IOException {
        MyBean4 bean = new MyBean4(1, null);

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(bean);

        System.out.println(result);
        assertThat(result, containsString("1"));
        assertThat(result, not(containsString("name")));

        // 禁用注解后
        mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        result = mapper.writeValueAsString(bean);
        System.out.println(result);

        assertThat(result, containsString("1"));
        assertThat(result, containsString("name"));
    }
}