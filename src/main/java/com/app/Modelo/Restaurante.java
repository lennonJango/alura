package com.app.Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Restaurante {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;

      @Column(name = "nome_restaurante")
      private String nome;

      @Column(name = "taxa_frete")
      private  double taxaFrete;


      @Column (name = "Localizacao")
      private String localizacao;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Restaurante other = (Restaurante) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
