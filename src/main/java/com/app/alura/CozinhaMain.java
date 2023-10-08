package com.app.alura;
import java.util.List;

import org.springframework.boot.WebApplicationType;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.app.Model.Cozinha;
import com.app.controller.CozinhaC;



public class CozinhaMain {

    public static void main(String[] args) {
        
        ApplicationContext applicationContext = new SpringApplicationBuilder(AluraApplication.class).web(WebApplicationType.NONE).run(args);


        CozinhaC controllerCoz = applicationContext.getBean(CozinhaC.class);

         Cozinha c2 = new Cozinha();
         c2.setNome("Mocambicana");

         
        //  System.out.println(c2.getNome());

         controllerCoz.adicionar(c2);
         

       List<Cozinha> cozinhas = controllerCoz.listar();


       for(Cozinha cozinha1 : cozinhas ){
        System.out.println(cozinha1.getNome());
       }

    }

    
}
