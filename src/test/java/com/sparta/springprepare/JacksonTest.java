package com.sparta.springprepare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springprepare.response.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object to Json : get Method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie", 95);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(star); //string 타입 JSON 형태로 변환

        System.out.println("json = " + json);
    }
}
