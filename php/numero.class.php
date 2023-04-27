<?php
    class Numero{
        private $numero;
        private $digitos;

        public function __construct($numero, $digitos){
            $this->numero = $numero;
            $this->digitos = 0;
        }
        public function numeroDeDigitos(){
            $num = $this->numero;
            while($num != 0){
                $num/=10;
                $this->digitos++;
            }

            return $this->digitos;
        }
    }
?>