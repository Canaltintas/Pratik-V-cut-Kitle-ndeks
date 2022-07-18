import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double boy,kilo;
        double vKitle;
        Scanner input = new Scanner(System.in);

        System.out.print("Boy uzunluğunuzu giriniz (m) :");
        boy=input.nextDouble();
        System.out.print("Kilonuzu giriniz (kg) :");
        kilo=input.nextDouble();

        vKitle=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksi : "+vKitle);

    }
}
