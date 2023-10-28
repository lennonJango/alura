package com.app.alura.Repositorio;

import java.util.List;

import com.app.alura.Modelo.Restaurante;

public interface RestauranteReposity {

    Restaurante salvarRestaurante();
    List <Restaurante> lisRestaurantes();
    
}
