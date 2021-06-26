public class Employee {
    String name;
    double maas;
    int workHours;
    int year;

    public Employee(String name, double maas, int workHours, int year) {
        this.name = name;
        this.maas = maas;
        this.workHours = workHours;
        this.year = year;
    }

    public double tax(double maas){
        double vergi;
        if (maas>1000){
            vergi = maas*0.03;
            maas = maas-vergi;
        }
        else {
            maas = this.maas;
        }
        return maas;
    }

    public int bonus(){
        int saat = this.workHours-40;
        int bonus = 0;
        if (this.workHours>40){
            saat = saat*30;

        }
        else {
            saat = saat*30;
        }
       return bonus = saat;
    }
     public int raiseSalary(double maas){
        double bonus2 = 0;
        if (2021 - this.year < 10){
            bonus2 = maas * 0.05;
            maas = maas+bonus2;
        }
        else if (2021 - this.year > 9 && 2021-this.year < 20){
            maas = maas * 0.1;
            maas = maas+bonus2;
        }
        else if (2021-this.year>19){
            maas = maas * 0.15;
            maas = maas+bonus2;
        }
        return (int) maas;

     }
    public String toString() {
        return "\n İsim: " + this.name +
                "\n Maas: " + this.maas +
                "\n Çalışma Saati: " + this.workHours +
                "\n Çalışma Yılı: " + this.year;

    }


}
