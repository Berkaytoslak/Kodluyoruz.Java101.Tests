import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban İnput: ");
        int taban = scanner.nextInt();
        System.out.print("Üs input: ");
        int us = scanner.nextInt();
        Main main = new Main();
        System.out.println(main.Islem(taban,us));
    }
    public int Islem(int taban, int us){

        int sonuc = 1;
        for (int i = 1; i<=us; i++){
            sonuc = sonuc*taban;
        }
        return sonuc;
    }

}
