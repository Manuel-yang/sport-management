package com.yanaemons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanAemons
 * @date 2021/10/19 15:17
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test()
    {
        return "Hello there!";
    }

}
