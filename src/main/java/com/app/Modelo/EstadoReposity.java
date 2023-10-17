package com.app.Modelo;

import java.util.List;

public interface EstadoReposity {

    Estado adicionarEstado (Estado estado);
    List<Estado> listaEstados();
    Estado buscarEstado(long ID);
    void apagarEstado(long Id);

    
    
}
