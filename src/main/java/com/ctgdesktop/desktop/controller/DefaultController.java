package com.ctgdesktop.desktop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @RequestMapping("/hi")
    public String sayHi(){
        return "hello microserver-eadp";
    }


}
