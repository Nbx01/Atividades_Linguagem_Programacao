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
