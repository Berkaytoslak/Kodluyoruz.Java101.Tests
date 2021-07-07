import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Imput=new Scanner (System.in);//Kullanıcıdan Değer Alamızı Sağlayan Class

        boolean [][]MayinKonum=new boolean[10][10];//	Mayınların Konumunu Tutuğumuz MultiArray

        char [][]TarlaGorunum=new char[10][10];//Mayın Tarlasının Görünümünü Tutan Array

        MineSweeper mineSweeper = new MineSweeper();

        mineSweeper.TarlaOlustur(MayinKonum,TarlaGorunum);//Tarlayı Oluşturan Fonksiyonun Çağırıldığı Yer

        boolean Kontrol=true;
        int HamleSayisi=0;

        //Oyunun Tekrar Döngüsü Ve Kazanma Kontrolü

        while(Kontrol) {
            HamleSayisi++;
            Kontrol=mineSweeper.Oyna(MayinKonum,TarlaGorunum,Imput);
            if(HamleSayisi==86) {
                System.out.println("Hic Mayina Basmadiniz Oyunu Kazandiniz!");
                Kontrol=false;
            }
        }

        System.out.println("Hamle Sayisi="+(HamleSayisi-1));
    }

}
