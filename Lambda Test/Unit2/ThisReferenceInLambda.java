package Unit2;

public class ThisReferenceInLambda {
    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void nonStaticdoProcess(){
        int i = 10;
        doProcess(i, (j) -> System.out.println("Value of i " + j + "\n" + this));
    }

    @Override 
    public String toString(){
        return ">THIS IS FROM THE LAMBDA";
    }

    public static void main(String[] args){
        int i = 10;
        ThisReferenceInLambda test = new ThisReferenceInLambda();

        //anonymous inner class example using "this"
        //"This" refers tho the anonymous inner class (since "this refers to the anonomous inner class.")
        test.doProcess(i, new Process(){
            @Override
            public void process(int i){
                System.out.println("Value of i " + i);
                System.out.println(this.toString());
            }

            @Override
            public String toString(){
                return ">THIS IS FROM THE ANOYNOMOUS INNER CLASS";
            }
        });

        test.nonStaticdoProcess();

        //This doesn't work: test.doProcess(i, (j) -> System.out.println("Value of i " + j + "\n" + this));
        //This also doesn't work: System.out.println(this);
        //because "this" refers to the static main method, which doesn't have a this.
    }
}
