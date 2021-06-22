import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik ortalaması: ");
        int mat = scanner.nextInt();

        System.out.print("fizik ortalaması: ");
        int fiz = scanner.nextInt();

        System.out.print("kimya ortalaması: ");
        int kim = scanner.nextInt();

        System.out.print("tarih ortalaması: ");
        int tar = scanner.nextInt();

        System.out.print("türkçe ortalaması: ");
        int tür = scanner.nextInt();

        System.out.print("müzik ortalaması: ");
        int müz = scanner.nextInt();

        Main main = new Main();
        int orta = main.Ortalama(mat,fiz,kim,tar,tür,müz);
        if (orta > 60){
            System.out.println(orta + " puan ile sınıfı geçtiniz");
        }
        else{
            System.out.println(orta + " puan ile kaldınız");
        }
    }

    private int Ortalama(int mat , int fiz, int kim, int tar, int tür, int müz) {
        int ort;
        return ort = (mat + fiz + kim + tar + tür + müz)/6;

    }
}
