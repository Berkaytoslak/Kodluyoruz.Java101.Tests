import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yıl = scanner.nextInt();

        for (int i = 0; i<=yıl; i=i+4){
            if (i==yıl){
                System.out.println("Artık yıl: " + yıl);
            }
        }


    }
}
