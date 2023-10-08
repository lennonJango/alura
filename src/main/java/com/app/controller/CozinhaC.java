package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.app.Model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CozinhaC {

    // Em todas as classes controller tem que passar um manager para comunicar com o jpa
      @PersistenceContext
      @Autowired
      private EntityManager manager;

    public List<Cozinha> listar(){

        // O metodo que lista
      TypedQuery<Cozinha> query= manager.createQuery("from Cozinha", Cozinha.class);

    //   Como ter o resultado da query
       return query.getResultList();
    }


    // Esta anotacao serve para guardar o valo na base de dados
    @Transactional
    public Cozinha adicionar (Cozinha cozinha){
      return manager.merge(cozinha);
    }


    /*
     * Este metodo faz a busca consoante ao ID
     */
    public Cozinha umCozinha(long id){
      return manager.find(Cozinha.class, id);
    }
    
}
