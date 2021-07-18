import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Para giriniz:");
        int a= scanner.nextInt();
        int dizi[] = {20,50,100};
        int x = 0;
        int y = 0;
        int z = 0;
        while(a>=dizi[2]){
            a = a-100;
            x = x+1;
        }
        while (a>=dizi[1]){
            a = a-50;
            y = y+1;
        }
        while (a>=dizi[0]){
            a = a-20;
            z = z+1;
        }
        if (a>0){
            System.out.println("20 nin katlarını giriniz");
        }
        else {
            if (x>0)
            {
                System.out.println(x+" adet 100 lük");
            }
            if (y>0){
                System.out.println(y+" adet 50 lik");
            }
            if (z > 0) {
                System.out.println(z+" adet 20 lik");
            }
        }
    }
}
