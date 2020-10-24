package Unit2;

public class ClosuresInLambda {
    public static void main(String[] args){
        int i = 10;
        int b = 20;
        //similar to the closure in Anynomous Inner Class
        //Java compiler freezes the value of b when the doProcess is executed
        //therefore, it takes 20, even if b is changes again.
        doProcess(i, n -> System.out.println(n + b));
    }

    public static void doProcess(int i, Process2 p){
        p.process(i);
    }
    
}

interface Process2 {
    void process(int i);
}

