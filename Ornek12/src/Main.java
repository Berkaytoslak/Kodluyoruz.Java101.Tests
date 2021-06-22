import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        Customer A = new Customer("Berkay","Toslak",23);
        customers.add(A);
        Customer B = new Customer("Ceren","Şahin",21);
        customers.add(B);
        for (Customer customer:customers){
            System.out.println(customer.getIsim() +" "+ customer.soyIsım+" "+customer.yas);
        }
    }
}
