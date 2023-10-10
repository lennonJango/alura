package com.app.alura;
import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.app.Modelo.Cozinha;
import com.app.controller.CozinhaC;



public class CozinhaMain {

    public static void main(String[] args) {
        
        ApplicationContext applicationContext = new SpringApplicationBuilder(AluraApplication.class).web(WebApplicationType.NONE).run(args);


        CozinhaC controllerCoz = applicationContext.getBean(CozinhaC.class);

        // System.out.println(controllerCoz.umCozinha(1).getNome());

        CozinhaC c1 = new CozinhaC();

        List<Cozinha> cozinhas =  c1.listar();

        for ( Cozinha cozinha : cozinhas){

            System.out.println(cozinha);
        }


        
       

         
        //  System.out.println(c2.getNome());

    //      controllerCoz.adicionar(c2);
         

    //    List<Cozinha> cozinhas = controllerCoz.listar();


    //    for(Cozinha cozinha1 : cozinhas ){
    //     System.out.println(cozinha1.getNome());
    //    }

    }

    
}
