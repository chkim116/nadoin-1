package com.nado.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(path="/test")
    public String test(){
        return null;
    }
}
