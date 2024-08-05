package stringQuestion;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

class  Calculator {
    int number1;
    int number2;


    public int addition(int a, int b)
    {
        return  a+b;
    }
}


public class Dummy1 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the the First Number: ");
        calculator.number1=scanner.nextInt();
        System.out.println("Enter the the Second Number: ");
        calculator.number2=scanner.nextInt();

        System.out.println("1. Add\n" +
                "2. Sub\n" +
                "3. Mul\n" +
                "4. div");

        System.out.println("Please Choose An Options: ");
        int option=scanner.nextInt();
        switch (option)
        {
            case 1:
            {
                int additionResult=calculator.addition(calculator.number1,calculator.number2);
                System.out.println("Sum is: "+additionResult);
            }
        }
    }

}
