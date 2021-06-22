import java.util.Scanner;

public class ATM {
    public void islem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("========GIRIS BASARILI=========: ");
        System.out.print("Bakiye giriniz: ");
        int bakiye = scan.nextInt();
        while(true)
        {
            System.out.print("islem giriniz: ");
            int menu = scan.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("========BAKİYE SORGULA=========: ");
                    System.out.println("Bakiyeniz: " + bakiye);
                    break;
                }
                case 2: {
                    System.out.println("========PARA YATIR=========: ");
                    System.out.print("Yatıracağınız miktar: ");
                    ParaYatır paraYatir = new ParaYatır(scan.nextInt());
                    bakiye = paraYatir.getMiktar() + bakiye;
                    System.out.println("Yeni bakiye: " + bakiye);
                    break;
                }
                case 3: {
                    System.out.println("========PARA CEK=========: ");
                    System.out.print("Cekeceğiniz miktar: ");
                    ParaCek paraCek = new ParaCek(scan.nextInt());
                    if (paraCek.getMiktar() > bakiye) {
                        System.out.println("Bakiye yetersiz...");
                    } else {
                        bakiye = bakiye - paraCek.getMiktar();
                        System.out.println("Yeni bakiyeniz: " + bakiye);
                    }
                    break;
                }
                case 0: {
                    System.out.println("Çıkış Yapılıyor...");
                    System.exit(menu);
                }
                default:{
                    System.out.println("Geçerli işlem giriniz...");
                }
            }
        }
    }

}
