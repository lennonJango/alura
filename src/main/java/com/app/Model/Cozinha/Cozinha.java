package com.app.Model.Cozinha;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Entendidade da tabela Cozinha no mysql
 */
@Entity
@Table(name = "tab_cozinhas")
public class Cozinha {

    @Id
    private Long id;

    @Column (name = "nome_cozinha")     
    private String nome;

    @Column (name = "horario")
    private Data horData; 
     
}
