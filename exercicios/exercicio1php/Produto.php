<?php
class Produto {
    private $nome;
    private $preco;
    private $quantidade;
    private $desconto;
    private $valorFinal;
    
    //$nome
    public function getNome() {
        return $this->nome;
    }
    public function __contruct($nome) {
        $this->$nome = $nome;
    }
    //preço
    public function getPreco($preco,$quantidade) {
        $this->$preco= $preco*$quantidade;
        return $this->preco;
    }
    public function getPrecoInicial(){
        return $this->preco;
    }
    public function __construct($preco) {
        $this->$preco = $preco;
    }
    //quantidade
    public function getQuantidade() {
        return $this->quantidade;
    }
    public function __construct($quantidade) {
        $this->$quantidade = $quantidade;
    }
    //$desconto
    public function getDesconto() {
        $this->desconto = 0;
        if ($quantidade>10 and $quantidade<=20)
            $desconto = ($preco)*10/100;
        else if ($quantidade>20 and $quantidade<=50)
            $desconto = ($preco)*20/100;
        else if ($quantidade>50)
            $desconto = ($preco)*25/100;
        
        return $desconto;
    }
    public function setDesconto($desconto) {
        $this->desconto = $desconto;
    }
    //valorFinal
    public function getValorFinal() {
        $valorFinal = $preco-$desconto;
        return $valorFinal;
    }
    public function setValorFinal($valorFinal) {
        $this->$valorFinal = $valorFinal;
    }
    public function __construct($nome, $preco, $quantidade) {
        $this->nome = $nome;
        $this->preco = $preco*$quantidade;
        $this->quantidade = $quantidade;
        $desconto = getDesconto();
    }
}
?>