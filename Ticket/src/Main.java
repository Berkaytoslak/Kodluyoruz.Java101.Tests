import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar = 0.10;
        int toplamTutar = 0;
        System.out.print("Mesafe giriniz: ");
        int mesafe = scanner.nextInt();
        System.out.print("yas giriniz: ");
        int yas = scanner.nextInt();
        System.out.print("gidis-dönüş var mı (var ise 1 yoksa 2) giriniz: ");
        int gidis = scanner.nextInt();

        if (yas<12){
            int yasİndirimi1;
            toplamTutar = (int) (mesafe * tutar);
            yasİndirimi1 = (int) (toplamTutar*0.50);
            toplamTutar = toplamTutar - yasİndirimi1;
            if (gidis == 1){
                int indirim1;
                indirim1 = (int) (toplamTutar * 0.20);
                toplamTutar = toplamTutar - indirim1;
            }
        }
        if (yas>=12 && yas<24){
            int yasİndirimi2;
            toplamTutar = (int) (mesafe * tutar);
            yasİndirimi2 = (int) (toplamTutar*0.10);
            toplamTutar = toplamTutar - yasİndirimi2;
            if (gidis == 1){
                int indirim2;
                indirim2 = (int) (toplamTutar * 0.20);
                toplamTutar = toplamTutar - indirim2;
            }
        }
        if (yas>65){
            int yasİndirimi3;
            toplamTutar = (int) (mesafe * tutar);
            yasİndirimi3 = (int) (toplamTutar*0.30);
            toplamTutar = toplamTutar - yasİndirimi3;
            if (gidis == 1){
                int indirim3;
                indirim3 = (int) (toplamTutar * 0.20);
                toplamTutar = toplamTutar - indirim3;
            }
        }
        if (yas>=24 && yas <= 65){
            toplamTutar = (int) (mesafe * tutar);
            if (gidis == 1){
                int indirim4;
                indirim4 = (int) (toplamTutar * 0.20);
                toplamTutar = toplamTutar - indirim4;
            }
        }
        
        System.out.println("toplam tutar: " + toplamTutar);

    }
}
