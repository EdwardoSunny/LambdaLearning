package Unit2;
import java.util.function.Predicate;
import java.util.*;;

//Using this, no need to create an interface
public class PerdicateInterface {
    public static void main(String[] args){
        List<String> stuff = new ArrayList<String>();
        stuff.add("Hi");
        stuff.add("poop");
        stuff.add("water");
        stuff.add("Edward");

        printIfstartWith(stuff, s -> s.startsWith("E"));
    }
    //predicate is an interface in the package function.
    //predicate has method test(T t), the T is an generic type, that can be any
    //object type
    //Method test of predicate returns a boolean
    public static void printIfstartWith(List<String> objects, Predicate<String> predicate){
        for (String s : objects){
            if (predicate.test(s)){
                System.out.println(s);
            }
        }
    }
}
