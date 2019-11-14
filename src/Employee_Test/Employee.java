package Employee_Test;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private Date hireDate;

    public Employee(String name, String surname, double salary, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        hireDate = calendar.getTime();

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
