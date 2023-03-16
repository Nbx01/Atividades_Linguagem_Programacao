package conversao;

public class binario{   

    private String bin;
    public binario() {
        bin = "";
    }
    
    public String Dec_Bin(int decimal){
        int valor = decimal;
        if (decimal == 0) {
            bin = "0";
        }
        while(valor != 0){
        int resto = valor % 2;
        bin = resto+bin;
        valor = valor/2;
        }
        return bin;
    }

}