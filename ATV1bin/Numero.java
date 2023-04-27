package ATV1bin;

public abstract class Numero {
    protected int numero;
    //Numero
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public abstract String ehPalindromo();
}
