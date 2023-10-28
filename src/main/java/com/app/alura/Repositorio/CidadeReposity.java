package com.app.alura.Repositorio;

import java.util.List;

import com.app.alura.Modelo.Cidade;

public interface CidadeReposity {

    Cidade adicionarCidade(Cidade cidade);

    List<Cidade> listarCidades();

    Cidade buscarCidade(long Id);

    void apagarCidade(long Id);

}
