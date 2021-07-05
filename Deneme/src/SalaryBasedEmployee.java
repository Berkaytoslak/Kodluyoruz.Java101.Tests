public class SalaryBasedEmployee extends Employee{
    int salary;
    public SalaryBasedEmployee(String name,int salary) {
        super(name);
        this.salary = salary;
    }

    public int Salary(){
        return this.salary;
    }
    public String toString(){
        return this.name + "is S.B. employee";
    }
}
