package exercicios.exercicio2java;
import java.util.Scanner;
public class App extends numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numero numero1 = new numero();
        System.out.println("Digite o numero inicial da tabuada: ");
        int numinicial1 = sc.nextInt();
        numero1.setNumero(numinicial1);
        System.out.println("Digite o numero final da tabuada: ");
        int numfinal1 = sc.nextInt();
        numero1.setNumerofinal(numfinal1);
        System.out.println(numero1.getNumero()+" x "+numero1.getNumerofinal()+" = ");

        sc.close();
    }
}
