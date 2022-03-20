import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("ucgenin 1. kenar uzunlugunu giriniz: ");
        double ken1 = inp.nextDouble();

        System.out.println("ucgenin 2. kenar uzunlugunu giriniz: ");
        double ken2 = inp.nextDouble();

        System.out.println("ucgenin 3. kenar uzunlugunu giriniz: ");
        double ken3 = inp.nextDouble();

        double yari = (ken1+ken2+ken3)/2;
        double alan = Math.sqrt(yari*(yari-ken1)*(yari-ken2)*(yari-ken3));

        System.out.println("Ucgenin Alanı: " + alan);
    }
}
