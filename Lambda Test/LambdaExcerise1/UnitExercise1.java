package LambdaExcerise1;
import LambdaExcerise1.Person;

import java.util.*;

public class UnitExercise1 {
    public static void main(String[] args){
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Matthew", "Arnold", 39));
        people.add(new Person("Lewis", "Carroll", 42));
        people.add(new Person("Charles", "Dickens", 60));
        people.add(new Person("Charlotte", "Bronte", 45));
        people.add(new Person("Thomas", "Carlyle", 51));

        //Step 1: Sort List by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //Step 2: Create a method that prints all elements in the list
        System.out.println(">PRINTING ALL PEOPLE");
        
        printIfCondition(people, p -> true);


        //Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println(">PRINTING PEOPLE WITH LAST NAME STARTING WITH C");
        printIfCondition(people, p -> p.getLastName().startsWith("C"));
        
    }

    public static void printIfCondition(List<Person> people, Condition cond){
        for (Person p : people){
            if (cond.startsWithC(p)){
                System.out.println(p.toString());
            }
        }
    }
}

@FunctionalInterface
interface Condition {
    public boolean startsWithC(Person p);
}
