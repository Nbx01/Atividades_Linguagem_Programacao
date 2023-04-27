package revisao;

public class App {
    public static void main(String[] args) {
        // revisao1 = new Revisao();
        // revisao1 = new Revisao("Nub", 15);
        Revisao revisao1;
        revisao1.getNome();
        revisao1.getIdade();
        System.out.println(revisao1.getNome()+revisao1.getIdade());
        revisao1.setNome("Marcelo");
        revisao1.setIdade(14);
        System.out.println(revisao1.getNome()+revisao1.getIdade());
        revisao1.cadastrar("Nub", 15);
        revisao1.cadastrar();
        revisao1.exibir();
        
    }
}
