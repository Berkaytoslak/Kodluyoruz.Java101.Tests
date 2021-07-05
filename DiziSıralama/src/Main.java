import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int boyut = scanner.nextInt();

        int dizi[] = new int[boyut];

        for (int i = 0; i<dizi.length; i++){
            System.out.print("Sayıları Gir: ");
            dizi[i] = scanner.nextInt();
        }
        for (int i : dizi){
            System.out.println("sayi: " + i);
        }
        int min = dizi[0];
        for (int j = 1; j<dizi.length; j++){
            if (min > dizi[j]){
                min = dizi[j];
            }
        }
        System.out.println(min);

    }
}
