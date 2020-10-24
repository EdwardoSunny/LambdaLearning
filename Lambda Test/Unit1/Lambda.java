package Unit1;

public class Lambda {
    public static void main(String[] args){
        //if you do myLambda myLambdaFunction = (int i) -> System.out.println("Hello World");
        //the above is not going to work because the even though the interface's return type is also void, the lambda's function has 
        //a parameter while the interface doesn't, so it doesn't like it (The signature of the interface and the lambda doesn't match).
        //THE NUMBER OF PARAEMETERS IN THE INTERFACE AND IN THE LAMBDA MUST BE THE SAME!!!

        myLambda LambdaGreeting = () -> System.out.println("Hello World");
        //Or
        greetingInterface LambdaGreeting2 = () -> System.out.println("This is also hello world!");

        //acts like an implementation of greetingInterface.
        //The OOP version is an instance of the class Greet that implements the greetingInterface
        LambdaGreeting.function();

    }




}

//uses a interface as the type for lambda functions
//the interface must have the same number of parameters and same return type as the lambda.

//either use this or the interface we've already created call greetingInterface.
//allows for backward comp.
interface myLambda {
    //should have only one method, so that java knows which one you are reffering to when you use this interface.
    void function();
}

