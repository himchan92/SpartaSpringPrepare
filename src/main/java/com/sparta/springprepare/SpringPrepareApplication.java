package com.sparta.springprepare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrepareApplication {

    /*
        API란?
        - 서로다른 프로그램 데이터를 주고받기위해 일종의 약속한 방식의 인터페이스 수행
        - 정해진 값을 주고받는 것

        스프링부트 장점
        - 내장톰캣으로 별도설정없이 바로 사용가능
        - 라이브러리 별도 설정 필요없이 gradle 통해 자동으로 끌어와 셋팅
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringPrepareApplication.class, args);
    }

}