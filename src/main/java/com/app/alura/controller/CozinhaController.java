package com.app.alura.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.app.alura.Modelo.Cozinha;
import com.app.alura.Repositorio.CozinhaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CozinhaController implements CozinhaRepository {

    // Em todas as classes controller tem que passar um manager para comunicar com o jpa
      @PersistenceContext
      @Autowired
      private EntityManager manager;

      @Override
    public List<Cozinha> listar(){

        /* 
        O metodo que lista todas as cozinhas no banco de dados
        */ 
      TypedQuery<Cozinha> query= manager.createQuery("from Cozinha", Cozinha.class);

    //   Como ter o resultado da query
       return query.getResultList();
    }


    // Esta anotacao serve para guardar o valo na base de dados

    /*
     * Este metodo pode adicionar tanto como atualizar os dados usando o set
     */
    
    @Override
     @Transactional
    public Cozinha salvarCozinha (Cozinha cozinha){
      return manager.merge(cozinha);
    }

   /*
     * Este metodo faz a busca consoante ao ID
    */
     @Override
    public Cozinha buscarCozinha(Long id) {
      // TODO Auto-generated method stub
       return manager.find(Cozinha.class,id);
    }
    

    /*
     * Para conseguir remover uma instancia no jpa temos que primeiro tentar alterar o estado dessa entidade
     */
    @Override
     @Transactional
     public void removerCozinha (Cozinha cozinha){
         cozinha = buscarCozinha(cozinha.getId());
         manager.remove(cozinha);
     }


    
    
}
