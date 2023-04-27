<?php
    class AchadoEPerdido{
        private $codigo;
        private $titulo;
        private $descricao;
        private $dataTab;
        private $statusTab;
        private $pdo;

        public function __construct($titulo, $statusTab, $descricao, $codigo = null){
            $this->codigo = $codigo;
            $this->titulo = $titulo;
            $this->descricao = $descricao;
        }
	public function getTitulo() {
		return $this->titulo;
	}
	public function getDescricao() {
		return $this->descricao;
	}
	public function getStatusTab() {
		return $this->statusTab;
	}
	public function getDataTab() {
		return $this->dataTab;
	}
}
?>