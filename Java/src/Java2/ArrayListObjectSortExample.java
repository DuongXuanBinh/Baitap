package Java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin",47));
        people.add(new Person("Chris",34));
        people.add(new Person("Rajeev",25));
        people.add(new Person("David",31));

        System.out.println("Person List: "+people);

        people.sort((person1, person2)->{
            return person1.getAge() - person2.getAge();
        });
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted Person List By Age: "+people);

        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by name: "+people);
    }
}
