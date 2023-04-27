<?php
    // maneira de chamar o arquivo mae
    // include 
    // include_once
    // require
    require_once 'Pessoa.class.php';

    //php não entende que é uma classe, ele é só um arquivo, por isso tem que chamar "manualmente", 
    //eles colocam o arquivo dentro desse
    class FilhoDaPessoa extends Pessoa{
        //final é a ultima classe que tem dessa, não pode ser estendida
        private $email;

        public function __construct($nome, $idade, $email){
            parent::__construct($nome, $idade);//ele não tem visao do arquivo mae, 
            // por isso tem que chamar pelo construtor
            $this->email = $email;
        }
        public function getEmail(){
            return $this->nome;
        }
        public function setEmail($email){
            $this->email = $email;
        }
    }
?>