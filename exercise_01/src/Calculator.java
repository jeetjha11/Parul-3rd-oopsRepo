import java.util.Scanner;

public class Calculator {

    public void add(int a,int b)
    {
        System.out.println("Sum is: "+ (a+b));
    }
    public void sub(int a,int b)
    {
        System.out.println("Sub is: "+ (a-b));
    }
    public  void multiply(int a ,int b)
    {
        System.out.println("Multiply result is: "+ (a*b));
    }
    public void div(int a,int b)
    {
        System.out.println("Division result is: "+ (a/b));
    }


    // bitwise

    public void bitwiseAnd(int a,int b)
    {
        System.out.println("Bitwise And Result: "+ (a&b));
    }
    public void bitwiseOr(int a,int b)
    {
        System.out.println("Bitwise Or Result: "+ (a | b));
    }
    public void bitwiseXor(int a,int b)
    {
        System.out.println("Bitwise Xor Result: "+ (a ^ b));
    }
    public void bitwiseLeftShift(int a,int b)
    {
        System.out.println("Bitwise Left Shift Result: "+ (a >> b));
    }
    public void bitwiseRightShift(int a,int b)
    {
        System.out.println("Bitwise Right Shift Result: "+ (a << b));
    }


    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Scanner scanner=new Scanner(System.in);
        calculator.add(1,2);
        calculator.sub(2,1);
        System.out.println("Enter the first and second values");
        calculator.multiply(scanner.nextInt(), scanner.nextInt());
    }
}
