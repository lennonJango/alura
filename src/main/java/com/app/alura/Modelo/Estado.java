package com.app.alura.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table
public class Estado {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue
    private long Id;

    @Column(nullable = false)
    private String nome;

}
