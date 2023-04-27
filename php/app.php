<?php
    require_once 'FilhoDaPessoa.class.php';

    $FilhoDaPessoa1 = new FilhoDaPessoa("cccc", 10, "c@c.c.c");
    echo ($FilhoDaPessoa1->getNome());
    // echo é a mesma coisa que o system.out.print
    echo ("<br \>");
    $pessoa1 = new Pessoa("nub", 10);
    $pessoa1->cadastrar("nub", 15);
    echo ($pessoa1->getIdade());
?>