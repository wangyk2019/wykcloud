package com.wyk.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyk
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String test(String info){
        System.out.println("info");
        return "info";
    }
}
