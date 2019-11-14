package Inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Karol Parol",80000,1987,12,22);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Zenek Martyniuk",3500,1989,12,24);
        staff[2] = new Employee("Andrzej Pawlak", 2500,1995, 5,30 );

        System.out.println("-----------------------------------");
        for(Employee e : staff){
            System.out.println("Name: "+e.getName()+"\nSalary: "+e.getSalary()+"\nHire date: "+e.getHireDate()+"\n-----------------------------------");
        }
    }
}
