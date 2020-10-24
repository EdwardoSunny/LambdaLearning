package Unit3;

public class MethodReference {
    public static void main(String[] args){
        //Using Lambda
        //instead of using a Runnable AIC, you can use a lambda, since it is a Runnable interface.
        Thread t = new Thread(() -> printMessage());
        t.start();

        //Using Method Reference
        //This does the same as the above (using Lambda) --> if you are only running a method, you can do this instead of a lambda.
        Thread t2 = new Thread(MethodReference :: printMessage);
        t2.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
