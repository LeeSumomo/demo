package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // @hogehoge →アノテーションと呼ばれる Spring Boot の機能
public class IndexController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
