import edu.missouriwestern.spalmeter.csc254.people.Employee;
import edu.missouriwestern.spalmeter.csc254.people.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("John","Smith", LocalDate.now());
        Employee b = new Employee("Jane","Smith",LocalDate.now(), 18.50);

        Person c = new Employee("Jim", "Jones", LocalDate.now(), 9.50);

        System.out.println(a);
        System.out.println(b);
        System.out.println(b.getFirstName());
        System.out.println(((Employee)c).getPayRate()); //casting is necessary

        ArrayList<Person> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);
        people.add(new Person("Harvey", "Wallbanger", LocalDate.of(2017,1,1)));
        print(people);
        System.out.println("done");
    }
    public static void print(ArrayList<Person> list) {
        for(Person p : list) {
            System.out.println("--- " + p);
            System.out.println("     " + p.getLastName());
            System.out.println("     Hired: " + p.getEntry().getYear());
            if (p instanceof Employee) {
                System.out.println("     PayRate: " + ((Employee)p).getPayRate());
            }
        }
    }
}
