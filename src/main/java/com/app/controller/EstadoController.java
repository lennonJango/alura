package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.Modelo.Estado;
import com.app.Modelo.EstadoReposity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class EstadoController implements EstadoReposity {

    @PersistenceContext
    @Autowired
    private EntityManager manager;

    @Override
    public Estado adicionarEstado(Estado estado) {
        return manager.merge(estado);
    }

    @Override
    public List<Estado> listaEstados() {
        TypedQuery<Estado> estadosListados = manager.createQuery("from estado", Estado.class);

        return estadosListados.getResultList();
    }

    @Override
    public Estado buscarEstado(long ID) {
        return manager.find(Estado.class, ID);
    }

    @Override
    public void apagarEstado(long Id) {
        Estado estadoPorRemover = buscarEstado(Id);

        manager.remove(estadoPorRemover);
    }

}
