<?php
     require_once "AchadoEPerdido.class.php";
    class Conexao{
        private $host = 'localhost';
        private $user = 'root';
        private $dbName = 'ifmt';
        private $pass = '';
        private $port = 3306;
        private $pdo;

        public function __construct(){
            try{
            $this->pdo = new PDO("mysql:host={$this->host};dbname={$this->dbName};port={$this->port}",$this->user,$this->pass);
            }catch(PDOException $e){
                echo "Erro de acesso ao banco de dados ".$e->getMessage();
            }
        }
        public function insert($ocorrencia){
            $stmt = $this->pdo->prepare("INSERT INTO achadoeperdido(titulo, descricao, statusTab) VALUES (:titulo, :descricao, :statusTab); ");
            $stmt->bindValue(":titulo", $ocorrencia->getTitulo());
            $stmt->bindValue(":descricao", $ocorrencia->getDescricao());
            $stmt->bindValue(":statusTab", $ocorrencia->getStatusTab());
            $stmt->execute();
        }

        public function selectAll(){
            $stmt = $this->pdo->query("SELECT * FROM achadoeperdido;");
            return $stmt->fetchAll(PDO::FETCH_ASSOC);
        }
    }
?>