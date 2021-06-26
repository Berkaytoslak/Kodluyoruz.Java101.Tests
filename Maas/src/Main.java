public class Main {

    public static void main(String[] args) {
        Employee berk = new Employee("Berk",2000,45,1985);
        int toplam = 0;
        System.out.println(berk.toString());
        System.out.println("Vergi kesintisi ile maas: " + berk.tax(berk.maas));
        System.out.println("Bonus: " + berk.bonus());
        System.out.println("Maaş Artışı: " + berk.raiseSalary(berk.maas));
        toplam = (int) (berk.tax(berk.maas)+berk.bonus()+berk.raiseSalary(berk.maas));
        System.out.println("Toplam maaş: " + toplam);

    }
}
