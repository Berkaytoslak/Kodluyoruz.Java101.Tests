import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hesap hesap = new Hesap("berkay", "123");
        System.out.print("id: ");
        String id = scan.nextLine();
        System.out.print("Password: ");
        String password = scan.nextLine();
        if (id.equals(hesap.getId()) && password.equals(hesap.getPassword())) {
            ATM atm = new ATM();
            atm.islem();
        } else {
            System.out.println("Yanlış giriş tekrar deneyiniz...");
        }
    }
}
