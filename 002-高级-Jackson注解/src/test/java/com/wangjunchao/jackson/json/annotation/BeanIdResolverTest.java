package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:56
 * All Rights Reserved !!!
 */
public class BeanIdResolverTest {
    @Test
    public void whenSerializingUsingJsonTypeIdResolver_thenCorrect()
            throws IOException {
        FirstBean bean1 = new FirstBean(1, "Bean 1");
        LastBean bean2 = new LastBean(2, "Bean 2");

        List<AbstractBean> beans = new ArrayList<>();
        beans.add(bean1);
        beans.add(bean2);

        BeanContainer serializedContainer = new BeanContainer();
        serializedContainer.setBeans(beans);

        // 序列化
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(serializedContainer);
        System.out.println(jsonString);
        assertThat(jsonString, containsString("bean1"));
        assertThat(jsonString, containsString("bean2"));

        // 反序列化
        BeanContainer deserializedContainer = mapper.readValue(jsonString, BeanContainer.class);
        List<AbstractBean> beanList = deserializedContainer.getBeans();
        assertThat(beanList.get(0), instanceOf(FirstBean.class));
        assertThat(beanList.get(1), instanceOf(LastBean.class));
    }
}