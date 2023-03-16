package conversao;

public class hexal {
    private String hexa;
    public hexal() {
        hexa = "";
    }
    
    public String Dec_Hexa(int decimal){
        int valor = decimal;
        if (decimal == 0) {
            hexa = "0";
        }
        while(valor != 0){
        int resto = valor % 16;
        if (resto == 10) {
            hexa = "A"+hexa;
        }else if(resto == 11){
            hexa = "B"+hexa;
        }else if(resto == 12){
            hexa = "C"+hexa;
        }else if(resto == 13){
            hexa = "D"+hexa;
        }else if(resto == 14){
            hexa = "E"+hexa;
        }else if(resto == 15){
            hexa = "F"+hexa;
        }else{
            hexa = resto+hexa;
        }
        
        
        valor = valor/16;
        }
        return hexa;
    }
}