package com.app.alura.Activador_cliente;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.alura.Cliente.Cliente;
import com.app.alura.Notificador.NivelDeUrgencia;
import com.app.alura.Notificador.Notificador_Interface;
import com.app.alura.Notificador.TipoDeNotificador;


@Component
public class ActivadorCliente   {

    // @Qualifier("SMS")
    @TipoDeNotificador(NivelDeUrgencia.NORMAL)
    @Autowired
    protected Notificador_Interface notificador;

         
    public void activarCliente(Cliente cliente){

        cliente.setCliente_activo(true);
         notificador.NotificarCliente(cliente);
          System.out.println("Cliente activo com sucesso");

         
    }
    
}
