package OOPactions;
//The interface greetingInterface that is implemented in the class Greet
//This interface has the action greet, and must be implemented in an object in order to perform the action
//OBJECT ORIENTED

@FunctionalInterface
//gives a clue to other developers that this is a functional interface
//shows the error in the interface rather than implementations of the interface.
public interface greetingInterface {
    public void greet();
}
