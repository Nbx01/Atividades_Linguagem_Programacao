package exercicios.feliz;

public class NumeroFeliz {
    private int numero;
    private boolean feliz;

    public NumeroFeliz(int numero  ) {
        this.numero = numero;
        this.feliz = ehFeliz(numero);
    }

    public boolean ehFeliz(int numero) {
        int soma = 0;
        int digito;

        while (numero != 1 || numero != 4) {
            soma = 0;
            while (numero > 0) {
                digito = numero % 10;
                soma += digito * digito;
                numero /= 10;
            }
            numero = soma;
        }

        if (numero == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getFeliz() {
        return feliz;
    }
}
