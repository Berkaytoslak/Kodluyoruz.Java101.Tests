import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi: ");
        int sayi = scanner.nextInt();
        int toplam =0;
        for (int i = 2; i<=sayi; i=i+2){
            if (i%3==0 && i%4==0){
                toplam = toplam+i;
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}
