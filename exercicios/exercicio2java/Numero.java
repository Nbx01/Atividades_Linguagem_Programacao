package exercicios.exercicio2java;
public class Numero {
    private int numero;
    private int numerofinal;
    private int mult;//multiplicação
    //Num inicial
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Num final
    public int getNumerofinal() {
        return numerofinal;
    }
    public void setNumerofinal(int numerofinal) {
        this.numerofinal = numerofinal;
    }
    public int getMult() {
        return mult;
    }
    public void setMult(int mult) {
        this.mult = mult;
    }
    numero(){
        int inicial = numero;
        int final = numerofinal;
        while(inicial<=final){
            mult = inicial*final;
        }
        return mult;
    }
    numero(){}

}
