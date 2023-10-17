package com.app.Modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurante {

      @Id
      @EqualsAndHashCode.Include
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;

      @Column(name = "nome_restaurante",nullable = false)
      private String nome;

      @Column(name = "taxa_frete",nullable = false)
      private  double taxaFrete;


      @Column (name = "Localizacao", nullable = false)
      private String localizacao;
   
     @ManyToOne
     @JoinColumn(nullable = false)
     private Cozinha cozinha;
}
