package com.app.alura.Notificador;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


import com.app.alura.Cliente.Cliente;



@Profile("prod")
@TipoDeNotificador( NivelDeUrgencia.NORMAL)

@Component
public class NotificadorEmail implements Notificador_Interface {


    public NotificadorEmail(){
        System.out.println("Ambiente de producao");
    }

    @Override
    public void NotificarCliente( Cliente cliente){

        System.out.println("Bem vindo ao servico Streaming "+ cliente.getNome()+" a sua subicriscao foi atraves do email  " + cliente.getEmail() + " ao servico streaming");
    }
    
}
