package com.sparta.springprepare.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    //static 안의 정적 html은 url아닌 바로 html파일명 통해 접근가능
    @GetMapping("/static-hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html"; //해당 경로로 이동처리
    }
}
