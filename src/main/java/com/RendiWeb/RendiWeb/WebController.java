package com.RendiWeb.RendiWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/")
    public String website(){
        return "Rendi's website";
    }
}
