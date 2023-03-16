package conversao;

public class binario{

    private String bin;
    private int decbin;

    public binario(int decbin){
        this.decbin = decbin;
        int valor = decbin;
        while(valor > 0){
        int resto = valor % 2;
        bin = resto+bin;
        valor = valor/2;
        }
        this.bin = bin;
    }
    public String setBin(){
        return bin;
    }
}