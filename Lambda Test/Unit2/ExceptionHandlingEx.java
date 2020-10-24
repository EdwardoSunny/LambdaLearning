package Unit2;
import java.util.function.BiConsumer;

public class ExceptionHandlingEx {
    public static void main(String[] args){
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        //execption of i = 0
        //where do you catch the exception?
        //catch 
        process(someNumbers, key, eWrapperLambda((n, i) -> System.out.println(n/i)));

        

    }

    public static void process(int[] nums, int key, BiConsumer<Integer, Integer> c) {
        for (int num : nums){
            c.accept(num, key);
            
        }
    }

    // Create a Wrapper lambda to catch them
    //can make this generic to catch exceptions.
    //implement into lib for robotics?
    private static BiConsumer<Integer, Integer> eWrapperLambda(BiConsumer<Integer, Integer> c){
        return (n, i) -> {
            try {
                c.accept(n, i);
            } catch (ArithmeticException e){
                System.out.println(">AN ARTHMETIC EXCEPTION OCCURED");
            }
        };
    }
}
