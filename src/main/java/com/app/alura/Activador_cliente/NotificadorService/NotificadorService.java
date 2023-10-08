 package com.app.alura.Activador_cliente.NotificadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.app.alura.Activador_cliente.ActivadorClienteEvent;
import com.app.alura.Notificador.NivelDeUrgencia;
import com.app.alura.Notificador.Notificador_Interface;
import com.app.alura.Notificador.TipoDeNotificador;
// import com.app.alura.Notificador.ConfigNotificador.NotificadorPropreties;

// Da vantagem porque tira a responsabilidade de uma classe trabalhar para tudo assim criando micro servicos
@Component
public class NotificadorService {
    
    @TipoDeNotificador(NivelDeUrgencia.NORMAL)
    @Autowired
    private Notificador_Interface  notificador_Interface;

    // Classe da variaveis de ambiente 
    // @Autowired
    // private NotificadorPropreties notificadorPropriedade;

    @EventListener
    public void activarClienteEvent (ActivadorClienteEvent event){
        System.out.println("Cliente " + event.getClientes().getNome() + " esta activo ");

        

        

        notificador_Interface.NotificarCliente(event.getClientes());
    }
}
