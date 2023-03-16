package conversao;

public class app_convert {
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
        int dec = i;
        binario binario1 = new binario(dec);
        System.out.println(binario1);
        }
    }
}
