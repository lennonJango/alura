package com.app.alura.rota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class rota {

    
   @GetMapping("/")
    @ResponseBody
    public String hello (){
        return "Hello Lennon";
    }
}
