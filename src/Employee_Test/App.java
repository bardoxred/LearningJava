package Employee_Test;

public class App extends Employee {

    public App(String name, String surname, double salary, int year, int month, int day) {
        super(name, surname, salary, year, month, day);
    }

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Grzegorz", "Brzęczyszczykiewcz" , 5320, 1982, 2,12);
        staff[1] = new Employee("Kamila", "Magdenburcka" , 2501, 2001, 5, 12);
        staff[2] = new Employee("Zenek" , "Martyniuk", 50200,2010, 12, 24);

        for(Employee e: staff){
            e.raiseSalary(5);
        }
        System.out.println("--------------------------------------");
        for(Employee e : staff){
            System.out.println("Name: "+e.getName()+"\nSurname: "+e.getSurname()+"\nSalary: "+e.getSalary()+"\nHire date: "+e.getHireDate()+"\n--------------------------------------");
        }

    }
}
