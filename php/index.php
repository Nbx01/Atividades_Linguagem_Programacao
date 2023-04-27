<?php
    require_once "cachorro.class.php";
    require_once "gato.class.php";
    require_once "animal.class.php";
    $gato1 = new Gato("Europeu", "miéu", "viver a vida dele");
    $matheus1 = new Cachorro("Americano", "hufhuf", "curar a depressão");

    echo ($gato1->emitirSom()."<br />");
    echo ($matheus1->emitirSom());
?>