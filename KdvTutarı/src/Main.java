import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutar Giriniz: ");
        int tutar = scanner.nextInt();
        float kdv1=0.18f;
        float kdv2 = 0.08f;
        int sonuc = 0;

        if (tutar<1000 && tutar>0){
            sonuc = (int) (tutar*kdv1);
            tutar = sonuc + tutar;
        }
        else if (tutar >= 1000){
            sonuc = (int) (tutar*kdv2);
            tutar = sonuc + tutar;
        }

        System.out.println("Kdv eklenmeli Sonuc: "+tutar);

    }
}
