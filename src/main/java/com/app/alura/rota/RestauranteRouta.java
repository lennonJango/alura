package com.app.alura.rota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestauranteRouta {


    @GetMapping("/Restaurante")
    @ResponseBody
    public String getResturante (){


        return "Restaurante api";
    }
    
}

