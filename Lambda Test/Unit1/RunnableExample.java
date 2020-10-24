package Unit1;

public class RunnableExample {
    public static void main(String[] args){
        //take in a new instance of runnable
        //old version of runnable using anynomous inner class.
        Thread myThread = new Thread(new Runnable() {
        //anynomous inner class
            @Override
            public void run(){
                System.out.println("Printed inside runnable");
            }
        });

        myThread.run();

        //Lambda version
        //New for java8
        //does Thread have the run method?
        //does Thread implement runnable?
        Thread myLambdaThread = new Thread(() -> System.out.println("Printed using lambda"));
        myLambdaThread.run();
    }
}
