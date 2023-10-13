package com.app.Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
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

      @Column(name = "nome_restaurante")
      private String nome;

      @Column(name = "taxa_frete")
      private  double taxaFrete;


      @Column (name = "Localizacao")
      private String localizacao;
   
}
