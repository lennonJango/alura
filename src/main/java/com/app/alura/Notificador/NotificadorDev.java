package com.app.alura.Notificador;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.alura.Cliente.Cliente;

@Profile("DEV")
@Component
public class NotificadorDev implements Notificador_Interface {


     public void NotificarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
       
        System.out.println("MENSAGEM DE TESTE :Bem vindo ao servico Streaming "+ cliente.getNome()+" a sua subicriscao foi activa via " + cliente.getContacto() + " ao servico streaming");

       
    }
}
