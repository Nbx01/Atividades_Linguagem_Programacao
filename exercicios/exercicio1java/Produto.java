package exercicios.exercicio1java;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double desconto;
    private double valorFinal;
    
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //preço
    public double getPreco() {
        preco = preco*quantidade;
        return preco;
    }
    public double getPrecoInicial(){
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    //quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    //desconto
    public double getDesconto() {
        desconto = 0;
        if (quantidade>10 && quantidade<=20)
            desconto = (preco)*10/100;
        else if (quantidade>20 && quantidade<=50)
            desconto = (preco)*20/100;
        else if (quantidade>50)
            desconto = (preco)*25/100;
        
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    //valorFinal
    public double getValorFinal() {
        valorFinal = preco-desconto;
        return valorFinal;
    }
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco*quantidade;
        this.quantidade = quantidade;
        desconto = getDesconto();
    }
    Produto(){}
}
