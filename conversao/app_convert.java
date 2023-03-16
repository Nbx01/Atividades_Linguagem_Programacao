package conversao;

public class app_convert {
    public static void main(String[] args) {
        System.out.println("Decimal | Binario | Octal | Hexadecimal");
        for (int i = 0; i <= 255; i++) {
            //decimal
            int decimal = i;
            //binario
            binario binario1 = new binario();
            String binStrg = binario1.Dec_Bin(decimal);
            //octal
            octal octa1 = new octal();
            String octaStrg = octa1.Dec_Oct(decimal);
            //Hexal
            hexal hexa1 = new hexal();
            String hexaStrg = hexa1.Dec_Hexa(decimal);
            System.out.println(decimal+" | "+binStrg+" | "+octaStrg+ " | "+hexaStrg);
            
        }
    }
}
/*OBS: Pensei fazer em tabela para ficar bonitinho mas fiquei com preguiça depois de pesquisar
       sobre como fazer, mas fiz oque foi pedido, e voce neto tinha falado sobre os comandos do java
       que ja faz essas conversoes, pesquisei e tem mesmo mas não acho que seja da maneira que queira
       tem em JOP mas não sei fazer ficar todos um abaixo do outro então não fiz.
       JOptionPane.showMessageDialog(null,decimal+" | "+binStrg+" | "+octaStrg+ " | "+hexaStrg );
*/