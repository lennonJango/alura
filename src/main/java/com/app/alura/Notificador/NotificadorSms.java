package com.app.alura.Notificador;
import org.springframework.stereotype.Component;
import com.app.alura.Cliente.Cliente;



// Qualifier  costumizado 
@TipoDeNotificador( NivelDeUrgencia.URGENTE)
// @Qualifier("SMS")
@Component
public class NotificadorSms implements Notificador_Interface{

    @Override
    public void NotificarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
       
        System.out.println("Bem vindo ao servico Streaming "+ cliente.getNome()+" a sua subicriscao foi activa via " + cliente.getContacto() + " ao servico streaming");

      
    }

    
}
