package com.app.alura.Cliente;

public class Cliente {


    protected String nome;
    protected String email;
    protected int idade ;
    protected String bairro;
    protected int contacto;
    protected boolean cliente_activo=false;


    

    public Cliente(String nome, String email, int idade, String bairro, int contacto) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.bairro = bairro;
        this.contacto = contacto;
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

    public String getNome() {
        return nome;
    }

    public void setCliente_activo(boolean cliente_activo) {
        this.cliente_activo = cliente_activo;
    }

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

    
    
    public String toString(){

        return " Nome \n" + this.getNome()+ " idade \n " + this.getIdade() + " email \n" + this.getEmail() + " bairro \n" + this.getBairro(); 
    }
    
}
