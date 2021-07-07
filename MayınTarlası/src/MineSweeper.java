import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    //Mayın Tarlasının Görüntüsünü Bastıran Fonksiyon
    public static void TarlaBastir(char x[][]) {

        for(int i=0;i<x[0].length;i++) {
            System.out.print(" | "+i);
        }
        System.out.println(" |");
        for(int i=0;i<=4*(x.length)+1;i++) {
            System.out.print("_");
        }
        System.out.println();
        for(int i=0;i<x.length;i++) {

            System.out.print(i+"| ");

            for(int j=0;j<x[0].length;j++) {
                System.out.print(x[i][j]+" | ");
            }
            System.out.println();

        }

    }

    //Tarlanın  Görünümünü Ve Random Olarak Mayınları Yerleştiren Fonksiyon
    public static void TarlaOlustur(boolean x[][],char TarlaGorunus[][]) {
        Random rnd=new Random();
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[0].length;j++) {
                x[i][j]=false;
                TarlaGorunus[i][j]='x';
            }
        }
        int MayinSayac=0;
        while(MayinSayac<15) {
            MayinSayac=0;
            int tempsatir=rnd.nextInt(10);
            int tempsutun=rnd.nextInt(10);
            x[tempsatir][tempsutun]=true;
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x[0].length;j++) {
                    if(x[i][j]==true) {
                        MayinSayac++;
                    }
                }
            }

        }

    }

    //Satır Hatalı Giriş Kontrolü
    public static int SatirKontrol(int Satir,Scanner Imput) {
        while((Satir>=10)||(Satir<0)) {
            System.out.println("Satir Hatali!");
            System.out.print("Lutfen Satir Girin (0-9): ");
            Satir=Imput.nextInt();
        }
        return Satir;
    }

    //Sütün Hatalı Giriş Kontrolü
    public static int SutunKontrol(int Sutun,Scanner Imput) {
        while((Sutun>=10)||(Sutun<0)) {
            System.out.println("Sutun Hatali!");
            System.out.print("Lutfen Sutun Girin (0-9):");
            Sutun=Imput.nextInt();
        }
        return Sutun;
    }

    // Oynanış Fonksiyonu Satır Ve Sütün Sayılarını Alıp Mayın Kontrolüne Göre true-false Değer Döndüren  Fonksiyon
    public static boolean Oyna(boolean MayinKonum[][],char TarlaGorunum[][],Scanner Imput) {
        TarlaBastir(TarlaGorunum);
        System.out.println();
        int Satir, Sutun;
        System.out.print("Lutfen Satir Girin (0-9):");
        Satir = Imput.nextInt();
        Satir = SatirKontrol(Satir, Imput);

        System.out.println();
        System.out.print("Lutfen Sutun Girin (0-9):");
        Sutun = Imput.nextInt();
        Sutun = SutunKontrol(Sutun, Imput);

        //Önceden Girilmiş  Konumların Girilmesini Engelleyen Fonksiyon
        while (TarlaGorunum[Satir][Sutun] == '0') {
            System.out.println();
            System.out.println("Bu Konumu Daha Once Girdiniz!");
            System.out.print("Lutfen Satir Girin (0-9):");
            Satir = Imput.nextInt();
            Satir = SatirKontrol(Satir, Imput);

            System.out.println();
            System.out.print("Lutfen Sutun Girin (0-9):");
            Sutun = Imput.nextInt();
            Sutun = SutunKontrol(Sutun, Imput);
        }
        if (MayinKonum[Satir][Sutun] == true) {
            for (int i = 0; i < TarlaGorunum.length; i++) {
                for (int j = 0; j < TarlaGorunum[0].length; j++) {
                    if (MayinKonum[i][j] == true) {
                        TarlaGorunum[i][j] = '*';
                    } else {
                        TarlaGorunum[i][j] = 'x';
                    }
                }
            }
            System.out.println();
            TarlaBastir(TarlaGorunum);
            System.out.println();
            System.out.println("Mayina Bastin Oyunu Kaybettin!");
            return false;
        } else {
            TarlaGorunum[Satir][Sutun] = '0';
            return true;
        }
    }
}
