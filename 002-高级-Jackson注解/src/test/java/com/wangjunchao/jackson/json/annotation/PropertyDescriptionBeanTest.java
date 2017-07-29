package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:36
 * All Rights Reserved !!!
 */
public class PropertyDescriptionBeanTest {
    @Test
    public void whenSerializingUsingJsonPropertyDescription_thenCorrect()
            throws JsonProcessingException {
        SchemaFactoryWrapper wrapper = new SchemaFactoryWrapper();
        ObjectMapper mapper = new ObjectMapper();
        mapper.acceptJsonFormatVisitor(PropertyDescriptionBean.class, wrapper);
        JsonSchema jsonSchema = wrapper.finalSchema();
        String jsonString = mapper.writeValueAsString(jsonSchema);
        System.out.println(jsonString);
        assertThat(jsonString, containsString(
                "This is a description of the name property"));
    }
}