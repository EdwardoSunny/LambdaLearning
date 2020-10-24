package Unit2;

public class ClosuresInAIC {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        doProcess(a, new Process() {
            @Override
            public void process(int i){
                //compiler knows there is the b value, even though the "new process" inner class is ran inside of doProcess
                //b is out of scope of doProcess
                //however, the compiler knows that variable b is effectively final
                //you can't do:
                //b = 30;
                //because that would change value of b
                System.out.println(i + b);
            }
        });

    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
