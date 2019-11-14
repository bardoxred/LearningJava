package Contructor_Test;


public class App {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Hubert", 30000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        System.out.println("--------------------------------");
        for(Employee e : staff){
            System.out.println("Name: "+e.getName()+"\nId: "+e.getId()+"\nSalary: "+e.getSalary()+"\n--------------------------------");
        }
    }

}
