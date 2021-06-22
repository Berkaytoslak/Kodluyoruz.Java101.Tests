import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = "berkay";
        String password = "1234";

        System.out.println("Giriş");
        System.out.print("id: ");
        String kullanıcı = scanner.nextLine();
        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        if (id.equals(kullanıcı) && password.equals(sifre)){
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Şifre veya id yanlış");
            System.out.println("Şifreyi değiştirmek için 1'e basın");
            String sec = scanner.nextLine();
            if (sec.equals("1")){
                System.out.println("Yeni şifre giriniz: ");
                String newPassword= scanner.nextLine();
                if (newPassword.equals(password)){
                    System.out.println("Şifre Oluşmadı");
                }
                else if(!newPassword.equals(password)){
                    System.out.println("Yeni şifre oluştu");
                }

            }
        }

    }
}
