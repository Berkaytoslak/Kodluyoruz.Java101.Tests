import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee e1 = new PartTimeEmployee("Ayşe",10);
        SalaryBasedEmployee e2 = new SalaryBasedEmployee("Burak" , 3500);
        Employee e3 = new PartTimeEmployee("Deniz",15);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        ArrayList<Employee> baseArray = new ArrayList<>();
        baseArray.add(new PartTimeEmployee("Ali",12));
        baseArray.add(new SalaryBasedEmployee("Zeynep",4000));
        baseArray.add(e3);
        for (int i = 0; i < baseArray.size();i++){
            System.out.println(baseArray.get(i) + "Salary" + baseArray.get(i).Salary());
        }

    }


}
