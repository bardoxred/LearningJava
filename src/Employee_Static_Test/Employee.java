package Employee_Static_Test;

public class Employee {

    private static int nextID;

    private String name;
    private double salary;
    private int id;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id+1;
    }
    public void setId() {
        id = nextID;
        nextID++;
    }
    public static int getNextID(){
        return nextID+1;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Zenek", 5000);
        System.out.println(e.getName()+" "+ e.getSalary());
    }
}
