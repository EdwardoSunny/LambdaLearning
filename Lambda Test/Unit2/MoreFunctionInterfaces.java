package Unit2;

import java.util.*;

import java.util.function.Predicate;
import java.util.function.Consumer;

public class MoreFunctionInterfaces {
    public static void main(String[] args){
        //create a ArrayList of words including Edward, Apple, AHAHHAHHA, hello, this shouldn't print
        List<String> things = new ArrayList<String>();
        things.add("Edward");
        things.add("Apple");
        things.add("AAHAHHAHAH");
        things.add("hello");
        things.add("this shouldn't print");

        //uses the method printContionally
        //passing in the ArrayList (implements the List interface)
        //passing in a inline lambda that is has properties of the Predicate interface
        //passing in a inline Lambda that has the properties of the Consumer interface.
        performContionally(things, s -> s.startsWith("A"), t -> System.out.println(t));
    }

    // consumer function interface takes in parameter of type <T>, and outputs void
    //predicate function interface takes in parameter of type<T>, and returns a boolean value.
    public static void performContionally(List<String> things, Predicate<String> p, Consumer<String> action){
        for (String s : things){
            if (p.test(s)){
                action.accept(s);
            }
        }

    }
}
