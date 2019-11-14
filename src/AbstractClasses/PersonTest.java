package AbstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Nadia Głoszcz", 5000, 2000, 11, 3);
        people[1] = new Student("Zenek Magik", "Informatyka");

        for(Person p : people){
            System.out.println(p.getName()+", "+p.getDescription());
        }
    }
}
