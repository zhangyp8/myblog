package com.zyp.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/hi")
    public String sayHello(@RequestParam(name = "name") String name ,Map map){
        map.put("name",name);
        return "hello";
    }
}
