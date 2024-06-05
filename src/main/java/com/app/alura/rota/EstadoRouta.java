package com.app.alura.rota;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.alura.Modelo.Estado;
import com.app.alura.controller.EstadoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping(value = "/Estado")
// Este controlador sera responsavel por controlar a routa da API do Estados
public class EstadoRouta {

    private EstadoController estado;

    @GetMapping
    public List<Estado> ListarEstados() {

        // Esta routa deve listar todas as cozinhas disponíveis
        return estado.listaEstados();
    }

    @GetMapping("{/estadoID}")
    @ResponseBody
    public Estado buscarEstadoPorId(@PathVariable("estadoID") long estadoID) {

        return estado.buscarEstado(estadoID);
    }

    @PostMapping
    public void criarEstado(Estado estado) {

        // Este metodo deve criar um novo estado

    }

}
