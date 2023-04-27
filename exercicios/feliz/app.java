package exercicios.feliz;

public class app {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            NumeroFeliz nf = new NumeroFeliz(19);
            System.out.println("O número " + i + " é feliz? " + nf.getFeliz());
        }
    }
}
