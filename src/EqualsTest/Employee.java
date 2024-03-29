package EqualsTest;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private Date hireDay;


    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }
    public int hashCode(){
        return Objects.hash(name, salary);
    }
    public String toString(){
        return getClass().getName() + "[name="+name+",salary= "+salary+",hireDay="+hireDay+"]";
    }
}
