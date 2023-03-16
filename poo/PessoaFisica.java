package poo;

public class PessoaFisica extends Pessoa {
    protected String cpf;

    public String getCpf(){
        return cpf;
    }

    PessoaFisica(String nome, String email, String cpf){
        super(nome, email);
        this.cpf = cpf;
    }

    public void acao(){
        System.out.println("Ação executada no objeto filho");
    }
}
