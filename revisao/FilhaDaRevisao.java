package revisao;
public class FilhaDaRevisao extends Revisao{
    private String email;
    FilhaDaRevisao(String email, String nome, int idade){
        super(nome, idade);
        this.email = email;
    }
    
    public void exibir(){
        System.out.println("Nome: "+nome+"\tIdade: "+idade+"\tEmail: "+email);
    }
}