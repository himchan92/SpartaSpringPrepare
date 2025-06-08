package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api") //중복되는것 최상단에 공통 URL로 설정가능
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody //반환 값 그대로 출력위해 필요하면 없을시 return문 해당 HTML 파일 필요
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청!!";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }
}