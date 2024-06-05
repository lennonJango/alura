package com.app.alura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class FormaPagamento {

    @PersistenceContext
    @Autowired
    private EntityManager manager;

    // Este método retorna uma lista das formas de pagamentos efetuadas
    public List<FormaPagamento> FormaPagamentos() {

        TypedQuery<FormaPagamento> formasDePagamentos = manager.createQuery("from forma_pagamento",
                FormaPagamento.class);

        return formasDePagamentos.getResultList();
    }

    // Este metodo deve criar uma formaPagamento para poder serem listadas no
    // sistema

    public FormaPagamento criarFormaPagamento(FormaPagamento formaPagamento) {

        return manager.merge(formaPagamento);

    }

    // Deve retornar os dados do cliente com os seus respectivos pagamentos
    public void pagamentosClientes(int Idcliente) {
        // Este método deve retornar uma lista de pagamentos encontrados no sistema
    }

}
