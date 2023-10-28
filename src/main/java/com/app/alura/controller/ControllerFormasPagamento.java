package com.app.alura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.alura.Modelo.FormaPagamento;
import com.app.alura.Repositorio.FormaPagamentoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Component
public class ControllerFormasPagamento implements FormaPagamentoRepository {


    @PersistenceContext
    @Autowired
    private EntityManager manager;

    @Override
    @Transactional
    public FormaPagamento salvar(FormaPagamento forma_Pagamento) {
       
        return manager.merge(forma_Pagamento);
    }


    @Override
    public List<FormaPagamento> listaPagamentos() {

        TypedQuery <FormaPagamento> query = manager.createQuery("from  FormaPagamento",FormaPagamento.class);
       
        return  query.getResultList();
    }


    @Override
    public FormaPagamento buscarPagamento(Long id) {
        return manager.find(FormaPagamento.class, id);
    }


    @Override
    @Transactional
    public void apagarPagamento(Long id) {
        // TODO Auto-generated method stub
        FormaPagamento formaPagamento=buscarPagamento(id);
        manager.remove(formaPagamento);
    }
    
}
