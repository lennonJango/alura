package com.app.alura.Notificador.ConfigNotificador;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.server")
public class NotificadorPropreties {


    /**
    * Propriedade de configuracao do servidor email
    **/
    protected String Servidoremail;

    /**
     * Propriedade de configuracao da porta do email
     */

    protected Integer porta;


    public Integer getPorta() {
        return porta;
    }

    public String getServidoremail() {
        return Servidoremail;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public void setServidoremail(String servidoremail) {
        Servidoremail = servidoremail;
    }
    
}
