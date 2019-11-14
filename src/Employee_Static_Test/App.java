package Employee_Static_Test;

public class App extends Employee {
    public App(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Grzegorz", 1111);
        staff[1] = new Employee("Małgorzata", 52321);
        staff[2] = new Employee("Kamila", 52312);

        System.out.println("----------------------------");
        for(Employee e : staff){
            e.setId();
            System.out.println("Name: "+ e.getName()+"\nID: "+e.getId()+"\nSalary: "+e.getSalary()+"\n----------------------------");
        }

        int n = Employee.getNextID();
        System.out.println("Next available identification is: "+n);

    }
}
