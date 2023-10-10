package com.app.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Entidade da tabela cliente no mysql
 */
@Entity
@Table(name = "Cliente")
public class ClienteAlura {
    
    @Id
    // Para gerar o auto_increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "bairro")
    private String bairro;

    private String email;
    private int contacto;
    private int idade;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBairro() {
        return bairro;
    }

    public int getContacto() {
        return contacto;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
    
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

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
        ClienteAlura other = (ClienteAlura) obj;
        if (id != other.id)
            return false;
        return true;
    }
  

}
