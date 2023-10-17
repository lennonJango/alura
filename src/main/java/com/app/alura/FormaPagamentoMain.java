package com.app.alura;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.app.Modelo.FormaPagamento;
import com.app.controller.ControllerFormasPagamento;


public class FormaPagamentoMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(AluraApplication.class)
                .web(WebApplicationType.NONE).run(args);

        ControllerFormasPagamento controllerPagamentos = applicationContext.getBean(ControllerFormasPagamento.class);

        FormaPagamento payment1= new FormaPagamento();
        payment1.setDescricao("Card Master");

         



        controllerPagamentos.salvar(payment1);
    


        List <FormaPagamento> listasPagamentos = controllerPagamentos.listaPagamentos();


        for (FormaPagamento pagamento : listasPagamentos){

           System.out.println(pagamento.getDescricao());

        }


        
}
}