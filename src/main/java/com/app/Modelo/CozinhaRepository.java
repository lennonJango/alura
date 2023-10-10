package com.app.Modelo;

import java.util.List;

public interface CozinhaRepository {
    List<Cozinha> listar();
    Cozinha buscarCozinha(Long id);
    Cozinha salvarCozinha(Cozinha cozinha);
    void removerCozinha(Cozinha cozinha);
    
}
