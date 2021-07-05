public class PartTimeEmployee extends Employee{
    int salary;
    int hour;
    public PartTimeEmployee(String name,int hour) {
        super(name);
        this.salary=50;
        this.hour = hour;
    }

    public int Salary(){
        return salary * hour;
    }
    public String toString(){
        return this.name + "is P.T. employee";
    }
}
