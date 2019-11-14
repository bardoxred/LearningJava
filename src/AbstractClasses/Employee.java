package AbstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {

    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getDescription() {
        return String.format("Pracownik zarabiający %.2f zł", salary);
    }
}
