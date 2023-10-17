package com.app.Modelo;

import java.util.List;

public interface PermissaoRepository {

    Permissao criarPermissao(Permissao permissao);

    List<Permissao> listaPermissao();

    Permissao buscarPermissao(long Id);

    void apagarPermissao(long Id);
}
