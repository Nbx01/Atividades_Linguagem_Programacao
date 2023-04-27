<?php
    class Animal{
        protected $nome;
        protected $som;

        public function __construct($nome, $som){
            $this->nome = $nome;
            $this->som = $som;
        }
        public function getSom($som){
            return $this->som;
        }
        public function emitirSom(){
            return $this->som;
        }
    }
?>