package com.daiqingshen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daiqingshen
 * @date 2017/12/28.
 */
@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("say")
    public String say(){
        return "say hi!!!!";
    }
}
