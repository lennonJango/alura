package com.app.alura.Repositorio;

import java.util.List;

import com.app.alura.Modelo.Permissao;

public interface PermissaoRepository {

    Permissao criarPermissao(Permissao permissao);

    List<Permissao> listaPermissao();

    Permissao buscarPermissao(long Id);

    void apagarPermissao(long Id);
}
