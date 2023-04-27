package revisao;

import java.util.Scanner;

public abstract class Revisao {
    protected String nome;
    protected int idade;

    Revisao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public abstract void exibir();
    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println();
        System.out.print("Informe a sua idade: ");
        idade = sc.nextInt();
        sc.close();
        // exibir();
    }
    Revisao(){}
}
