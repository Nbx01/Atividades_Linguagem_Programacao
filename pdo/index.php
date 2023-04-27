<?php
if($_SERVER['REQUEST_METHOD'] == 'POST'){
    //$codigo = (isset($_POST['codigo']) ? $_POST['codigo'] : null);
    $titulo = (isset($_POST['titulo']) ? $_POST['titulo'] : null);
    $descricao = (isset($_POST['descricao']) ? $_POST['descricao'] : null);
    //$datatab = (isset($_POST['datatab']) ? $_POST['datatab'] : null);
    $statusTab = (isset($_POST['statusTab']) ? $_POST['statusTab'] : null);
    require_once "AchadoEPerdido.class.php";
    require_once "Conexao.class.php";
    $achadoEPerdido = new AchadoEPerdido($titulo, $descricao, $statusTab);
    $conexao = new Conexao(); 
    $conexao->insert($achadoEPerdido);
    $dados = $conexao->selectAll();
    foreach($dados as $row){
        echo $row['codigo'] . "<br />".
            $row['titulo'] . "<br />".
            $row['descricao'] . "<br />".
            $row['dataTab'] . "<br />".
            $row['statusTab'];
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Achados E Perdidos</title>
</head>
<body>
    <form action="" method="POST">
        <fieldset>
            <legend>Registrar Achado e Perdidos</legend>
            <label for="titulo">Titulo: </label>
            <input type="text" name="titulo"><br />
            <label for="descricao">Descrição: </label>
            <input type="text" name="descricao"><br />
            <label for="statusTab">Status: </label>
            <select name="statustab" id="">
                <option value="achado">Achado</option>
                <option value="perdido">Perdido</option>
            </select><br />
            <input type="submit" name="Enviar">
        </fieldset>
    </form>
</body>
</html>