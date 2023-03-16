package poo;

public class App {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Nub","Nub@","123");
        System.out.println(pessoa1.nome+pessoa1.email+pessoa1.cpf);
        pessoa1.acao();
    }
}