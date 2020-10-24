package Unit3;

import java.util.*;
import java.util.function.*;

public class MethodReferenceEx {
    public static void main(String[] args) {
        List<String> things = new ArrayList<String>();
        things.add("Edward");
        things.add("Thing");
        things.add("hello");
        things.add("food");
        things.add("chopstick");
        things.add("Sweater");
        things.add("999");
        things.add("123");
        things.add("666");

        System.out.println(">PRINTING ALL OBJECTS IN THINGS");
        doConditionally(things, p -> true, System.out::println);

        System.out.println(">PRINTING ALL OBJECTS IN THINGS WITH LENGTH 3");
        doConditionally(things, p -> {
            if (p.length() == 3){
                return true;
            }
            return false;
        }, System.out::println);
        
    }

    public static void doConditionally(List<String> things, Predicate<String> pre, Consumer<String> con) {
        for (String object : things){
            if (pre.test(object)){
                con.accept(object);
            }
        }
    }
    
}
