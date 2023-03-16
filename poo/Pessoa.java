package poo;

abstract class Pessoa {
    protected String nome;
    protected String email;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    Pessoa(String nome){
        this.nome = nome;
    }
    Pessoa(){}
    
    public abstract void acao();
}
