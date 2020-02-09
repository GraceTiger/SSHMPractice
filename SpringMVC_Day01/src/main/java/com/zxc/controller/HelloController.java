package com.zxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public ModelAndView sayHello(@RequestParam(value = "name",defaultValue = "绣虎") String name,
                           ModelAndView mv){
        System.out.println("Hello");
        mv.addObject("name",name);
        mv.setViewName("success");
        return mv;
    }
}
