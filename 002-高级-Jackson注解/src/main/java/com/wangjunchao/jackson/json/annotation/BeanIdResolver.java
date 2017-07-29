package com.wangjunchao.jackson.json.annotation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;

import java.io.IOException;

/**
 * Author: 王俊超
 * Date: 2017-07-29 14:50
 * All Rights Reserved !!!
 */
public class BeanIdResolver extends TypeIdResolverBase {
    private JavaType superType;


    @Override
    public void init(JavaType javaType) {
        superType = javaType;
    }

    @Override
    public String idFromValue(Object value) {
        return idFromValueAndType(value, value.getClass());
    }

    @Override
    public String idFromValueAndType(Object value, Class<?> suggestedType) {
        String typeId = null;
        switch (suggestedType.getSimpleName()) {
            case "FirstBean":
                typeId = "bean1";
                break;
            case "LastBean":
                typeId = "bean2";
        }
        return typeId;
    }

    @Override
    public JavaType typeFromId(DatabindContext context, String id) throws IOException {
        Class<?> subType = null;
        switch (id) {
            case "bean1":
                subType = FirstBean.class;
                break;
            case "bean2":
                subType = LastBean.class;
        }
        return context.constructSpecializedType(superType, subType);
    }

    @Override
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.NAME;
    }
}
