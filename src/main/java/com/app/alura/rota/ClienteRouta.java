package com.app.alura.rota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.alura.Activador_cliente.ActivadorCliente;
import com.app.alura.Cliente.Cliente;
// import com.app.alura.Notificador.NotificadorEmail;

@Controller
public class ClienteRouta {


private ActivadorCliente activadorCliente;
// private NotificadorEmail notificadorEmail;



 ClienteRouta ( ActivadorCliente activadorCliente){

    this.activadorCliente = activadorCliente;
    // this.notificadorEmail = notificadorEmail;

    System.out.println(this.activadorCliente);
    // System.out.println(this.notificadorEmail);
 }


   @GetMapping("/cliente")
   @ResponseBody
   public String cliente (){


    Cliente c1 = new Cliente("Lennon Jango", "lennonjango@gmail.com", 18, "Liberdade", 878849891);
    activadorCliente.activarCliente(c1);
    // notificadorEmail.NotificarCliente(c1);


    return c1.toString();
   } 
    
}
