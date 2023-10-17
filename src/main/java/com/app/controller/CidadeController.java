package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.app.Modelo.Cidade;
import com.app.Modelo.CidadeReposity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;


@Component
public class CidadeController implements CidadeReposity {


    @PersistenceContext
    @Autowired
    private EntityManager manager;

    @Override
    @Transactional
    public Cidade adicionarCidade(Cidade cidade) {
       return manager.merge(cidade);
    }

    @Override
    public List<Cidade> listarCidades() {

        TypedQuery <Cidade> queryCidades = manager.createQuery("from Cidade",Cidade.class);

        return queryCidades.getResultList();
    }

    @Override
    public Cidade buscarCidade(long Id) {

     return manager.find(Cidade.class, Id);
    }

    @Override
    @Transactional
    public void apagarCidade(long Id) {
       
        Cidade cidadeRemovida = buscarCidade(Id);

        manager.remove(cidadeRemovida);
    }
    
}
