package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Author: 王俊超
 * Date: 2017-07-29 08:30
 * All Rights Reserved !!!
 */
public class EventTest {
    @Test
    public void whenSerializingUsingJsonSerialize_thenCorrect()
            throws JsonProcessingException, ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String toParse = "2017-07-29 19:30:00";
        Date date = df.parse(toParse);
        Event event = new Event("party", date);

        String result = new ObjectMapper().writeValueAsString(event);
        System.out.println(result);
        assertThat(result, containsString(toParse));
    }

    @Test
    public void whenDeserializingUsingJsonDeserialize_thenCorrect()
            throws IOException {

        String json = "{\"name\":\"party\",\"eventDate\":\"2017-07-29 19:30:00\"}";

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Event event = new ObjectMapper()
                .readerFor(Event.class)
                .readValue(json);

        assertEquals("2017-07-29 19:30:00", df.format(event.eventDate));
    }
}