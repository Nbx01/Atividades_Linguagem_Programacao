package conversao;

public class octal {
    private String oct;
    public octal() {
        oct = "";
    }
    
    public String Dec_Oct(int decimal){
        int valor = decimal;
        if (decimal == 0) {
            oct = "0";
        }
        while(valor != 0){
        int resto = valor % 8;
        oct = resto+oct;
        valor = valor/8;
        }
        return oct;
    }

}