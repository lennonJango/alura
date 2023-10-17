package com.app.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table
public class Permissao {
    

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descricao;

}
