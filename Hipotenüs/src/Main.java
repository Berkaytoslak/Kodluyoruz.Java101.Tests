import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk Kenar: ");
        int ilkKenar= scanner.nextInt();
        System.out.print("İkinci Kenar: ");
        int ikinciKenar = scanner.nextInt();
        double hipotenus=0;
        double çevreUzunluğu=0;

        hipotenus = Math.sqrt((ilkKenar*ilkKenar)+(ikinciKenar*ikinciKenar));
        System.out.print("Hipotenüs: " + hipotenus);
        çevreUzunluğu = hipotenus+ilkKenar+ikinciKenar;
        System.out.println("\n");
        System.out.print("Çevre Uzunluğu: " + çevreUzunluğu);
    }
}
