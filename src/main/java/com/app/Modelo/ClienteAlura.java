package com.app.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
 * Entidade da tabela cliente no mysql
 */

@Data
@Entity
@Table(name = "Cliente")
public class ClienteAlura {
    
    @Id
    // Para gerar o auto_increment
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "bairro")
    private String bairro;

    private String email;
    private int contacto;
    private int idade;
}
