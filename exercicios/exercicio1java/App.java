package exercicios.exercicio1java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto teste1 = new Produto();
        System.out.println("Informe o nome do produto: ");
        String nome1 = sc.nextLine();
        teste1.setNome(nome1);
        System.out.println("Informe o preco do produto: ");
        double preco1 = sc.nextDouble();
        teste1.setPreco(preco1);
        System.out.println("Informe a quantidade do produto");
        int quantidade1 = sc.nextInt();
        teste1.setQuantidade(quantidade1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Nome do Produto: "+teste1.getNome()+"\nPreço do Produto: "+teste1.getPrecoInicial()
        +"\nQuantidade do Produto "+teste1.getQuantidade()+"\nPreço final do Produto: "+teste1.getPreco()
        +"\nDesconto do Produto: "+teste1.getDesconto()+"\nValor a ser pago do Produto: "
        +teste1.getValorFinal());

        sc.close();
    }
}
