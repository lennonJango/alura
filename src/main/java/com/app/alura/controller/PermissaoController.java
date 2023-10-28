package com.app.alura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.alura.Modelo.Permissao;
import com.app.alura.Repositorio.PermissaoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Component
public class PermissaoController implements PermissaoRepository {

    @PersistenceContext
    @Autowired
    private EntityManager manager;

    @Override
    @Transactional
    public Permissao criarPermissao(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Override
    public List<Permissao> listaPermissao() {

        TypedQuery<Permissao> query = manager.createQuery("from Permissao", Permissao.class);

        return query.getResultList();
    }

    @Override
    public Permissao buscarPermissao(long Id) {
        return manager.find(Permissao.class, Id);
    }

    @Override
    @Transactional
    public void apagarPermissao(long Id) {

        Permissao permissaoPorRemover = buscarPermissao(Id);
        manager.remove(permissaoPorRemover);
    }

}
