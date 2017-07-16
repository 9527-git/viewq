package com.springboot.yang.indexcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/view")
    public String view (){
        return "index1.html";
    }
}
