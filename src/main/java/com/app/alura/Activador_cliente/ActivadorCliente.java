package com.app.alura.Activador_cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.app.alura.Cliente.Cliente;



@Profile("prod")
@Component
public class ActivadorCliente   {

    
    @Autowired
      protected ApplicationEventPublisher EventPublisher;

         
    public void activarCliente(Cliente cliente){

        cliente.setCliente_activo(true);
        

        // Event handler
        // Este é um evento que sera activo ao activar o cliente
        
      EventPublisher.publishEvent(new ActivadorClienteEvent(cliente));
        
    }
    
}
