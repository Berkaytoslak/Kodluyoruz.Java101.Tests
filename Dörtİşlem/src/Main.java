import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.print("sayi1 gir:");
        sayi1=input.nextInt();
        System.out.print("sayi2 gir: ");
        sayi2=input.nextInt();
        DortIslem dortIslem=new DortIslem();
        int sonuc1=dortIslem.Topla(sayi1,sayi2);
        System.out.println("Toplam= "+sonuc1);
        int sonuc2=dortIslem.Bol(sayi1,sayi2);
        System.out.println("Bolme= "+sonuc2);
        int sonuc3=dortIslem.Carp(sayi1,sayi2);
        System.out.println("Carpma= "+sonuc3);
        int sonuc4=dortIslem.Cıkar(sayi1,sayi2);
        System.out.println("Cıkarma= "+sonuc4);
    }

}
