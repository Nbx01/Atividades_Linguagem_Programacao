package ATV1bin;

public class Main {
    public static void main(String[] args) {
        Numero num1 = new Palindromo();
        int numVet[] = new int[100];
        int temp = 100;
        int vet = 0;
        
     while(vet<100){
        num1.setNumero(temp);
        String pali = num1.ehPalindromo();
        int numpali = Integer.valueOf(pali); 
        /*sendo bem sincero aqui, no chat ele tinha dado para formula do palindromo que para transformar
        inteiro em string era usar Integer.toString(valor) ai pensei, sera que transforma de String para int? 
        fucei as coisas e achei isso, o importante é que funcionou
        Obs: Ta uma bela gambiarra meu codigo.*/
            if(numpali == temp){
            numVet[vet] = temp;
            vet++;
            }
            temp++;
    }
        
        for (int i = 0; i < numVet.length; i++) {
            System.out.println("O Numero "+numVet[i]+" é palidromo");
        }
    }}