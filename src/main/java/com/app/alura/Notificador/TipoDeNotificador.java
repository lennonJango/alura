package com.app.alura.Notificador;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

// Isto é importante para a definicao do runtime , caso nao nenhuma anotacao sera compilada.
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDeNotificador {

    // Permite a escolha dos valores que sao  definidos no  enum
    NivelDeUrgencia value();

}
