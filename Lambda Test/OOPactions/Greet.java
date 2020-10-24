package OOPactions;
//the object that implements the interface called greeting interface in order to perform the action greet()
//THIS IS OBJECT ORIENTED
public class Greet implements greetingInterface {
   

   @Override
   public void greet() {
       System.out.println("Hello World");

   }

   public static void main(String[] args){
       //OOP version
       //implements interface
        Greet test = new Greet();
        


        //anynomous inner class
        //creates an implementation of greetingInterface and creates new instance of the class
        //basically the same thing as creating a lambda, mostly like a short cut for an anynomous inner class
        Greet innerClassGreeting = new Greet(){
            public void greet() {
                System.out.println("Hello World");
            }
        };

        innerClassGreeting.greet();
        test.greet();

    }
}
