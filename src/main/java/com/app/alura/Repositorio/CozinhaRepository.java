package com.app.alura.Repositorio;

import java.util.List;

import com.app.alura.Modelo.Cozinha;

public interface CozinhaRepository {
    List<Cozinha> listar();
    Cozinha buscarCozinha(Long id);
    Cozinha salvarCozinha(Cozinha cozinha);
    void removerCozinha(Cozinha cozinha);
    
}
