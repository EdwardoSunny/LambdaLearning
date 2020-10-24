import java.util.Scanner;

class ex1 {
    public static add myAddFunction = (int a, int b) -> {
        return a + b;};
    
    public static add otherAddFunction = (int a, int b) -> a + b;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(myAddFunction.add(a, b));
    }
    
}

interface add{
    int add(int a, int b);
}