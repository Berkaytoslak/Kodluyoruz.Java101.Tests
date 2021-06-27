import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int dizi[] = {15,12,788,1,-1,-778,2,0};
        int sayi = 5;
        int maks = 0;
        int min=1000;
        for (int i : dizi){
            if (i<sayi){
                if (i>maks){
                    maks = i;
                }
            }
            if (i>sayi){
                if (i<min){
                    min = i;
                }
            }
        }
        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen sayi: " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + maks);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + min);
    }
}