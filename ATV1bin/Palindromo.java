package ATV1bin;

public class Palindromo extends Numero {
    private String palindromo;

    @Override
    public String ehPalindromo() {
        int temp = numero;
        palindromo = "";
        while (temp != 0) {
            int numrun = temp%10;
            palindromo = palindromo+numrun;
            temp/=10;
        }
        return palindromo;
    }
}
