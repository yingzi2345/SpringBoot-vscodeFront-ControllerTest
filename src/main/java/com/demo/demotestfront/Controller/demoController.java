package com.demo.demotestfront.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class demoController {

    @GetMapping("/demotest")
    public String demo(){
        return "Hello,SpringBoot  Front";
    }
}
