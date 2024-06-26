import java.util.Scanner;

public class Calculator {
    Scanner sc=new Scanner(System.in);

    public void add(int a,int b)
    {
        System.out.println("Sum is: "+ (a+b));
    }public void sub(int a,int b)
    {
        System.out.println("Sub is: "+ (a-b));
    }
    public void mul(int a,int b)
    {
        System.out.println("Multiply is: "+ (a*b));
    }
    public void div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Any number can't divide by zero please enter something else: Please Enter again second values ");
            div(a,sc.nextInt());
            return;
        }
        System.out.println("Division is: "+ (a/b));
    }


    // bitwise or--->  |
    //bitwise xor-->   ^
    // bitwise left shift-->  >>
    //bitwise right shift-->  <<
    public  void bitwiseAnd(int a,int b)
    {
        System.out.println("Bitwise And Result:"+(a & b));
    }
    public  void bitwiseOr(int a,int b)
    {
        System.out.println("Bitwise Or Result:"+(a | b));
    }
    public  void bitwiseXor(int a,int b)
    {
        System.out.println("Bitwise Xor Result:"+(a ^ b));
    }
    public  void bitwiseLeftShift(int a,int b)
    {
        System.out.println("Bitwise Left Shift Result:"+(a >> b));
    }
    public  void bitwiseRightShift(int a,int b)
    {
        System.out.println("Bitwise Right Shift Result:"+(a << b));
    }


    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the values: ");
//        calculator.add(sc.nextInt(),sc.nextInt());
//        System.out.println("Enter the values: ");
//        calculator.sub(sc.nextInt(),sc.nextInt());
//        System.out.println("Enter the values: ");
//        calculator.mul(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the values for division: ");
        calculator.div(sc.nextInt(),sc.nextInt());

        System.out.println("Enter the values: ");
        calculator.bitwiseAnd(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the values: ");
        calculator.bitwiseOr(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the values: ");
        calculator.bitwiseXor(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the values: ");
        calculator.bitwiseLeftShift(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the values: ");
        calculator.bitwiseRightShift(sc.nextInt(),sc.nextInt());
    }

}
