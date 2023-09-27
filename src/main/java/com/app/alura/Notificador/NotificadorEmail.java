package com.app.alura.Notificador;


// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.app.alura.Cliente.Cliente;


@TipoDeNotificador( NivelDeUrgencia.NORMAL)
// @Qualifier("Email")
@Component
public class NotificadorEmail implements Notificador_Interface {

    @Override
    public void NotificarCliente( Cliente cliente){

        System.out.println("Bem vindo ao servico Streaming "+ cliente.getNome()+" a sua subicriscao foi activa via " + cliente.getEmail() + " ao servico streaming");
    }
    
}
