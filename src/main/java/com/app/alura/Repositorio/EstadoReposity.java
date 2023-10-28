package com.app.alura.Repositorio;

import java.util.List;

import com.app.alura.Modelo.Estado;

public interface EstadoReposity {

    Estado adicionarEstado (Estado estado);
    List<Estado> listaEstados();
    Estado buscarEstado(long ID);
    void apagarEstado(long Id);

    
    
}
