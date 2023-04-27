<?php
    require_once "animal.class.php";
    class Cachorro extends Animal{
        private $acao;

        public function __construct($nome, $som, $acao){
            parent::__construct($nome, $som);
            $this->acao = $acao;
    
        }
        public function getAcao(){
            return $this->acao;
        }
        public function emitirSom(){
            return "auau";
        }
    }
?>