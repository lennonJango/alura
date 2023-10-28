package com.app.alura.rota;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.alura.Modelo.Cozinha;
import com.app.alura.controller.CozinhaController;

@Controller
@RequestMapping(value = "/cozinhas")
public class CozinhaRouta {

  @Autowired
  private CozinhaController cozinhaController;

  @GetMapping
  @ResponseBody
  public List<Cozinha> cozinha() {

    return cozinhaController.listar();
  }

  @GetMapping("/{cozinhaId}")
  @ResponseBody
  public Cozinha buscarCozinha(@PathVariable("cozinhaId") Long cozinhaId) {
  
    return  cozinhaController.buscarCozinha(cozinhaId);
  }

  

}
