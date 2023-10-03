package com.app.Model.Restaurante;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Restaurante {

      @Id
      private int id;

      private String nome;
      private  double taxaFrete;
      private Date data;
    


      public Date getData() {
          return data;
      }

      public void setData(Date data) {
          this.data = data;
      }

      public int getId() {
          return id;
      }

      public String getNome() {
          return nome;
      }

      public double getTaxaFrete() {
          return taxaFrete;
      }


      public void setNome(String nome) {
          this.nome = nome;
      }

      public void setTaxaFrete(double taxaFrete) {
          this.taxaFrete = taxaFrete;
      }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
