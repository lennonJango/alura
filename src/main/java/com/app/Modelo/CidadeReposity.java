package com.app.Modelo;

import java.util.List;

public interface CidadeReposity {

    Cidade adicionarCidade(Cidade cidade);

    List<Cidade> listarCidades();

    Cidade buscarCidade(long Id);

    void apagarCidade(long Id);

}
