package practiceClasses;

import java.util.Scanner;

public class SwitchPractice {

    public static void add(int a,int b)
    {
        System.out.println("Sum is: "+(a+b));
    }
    public static void sub(int a,int b)
    {
        System.out.println("Sum is: "+(a-b));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char choice;
        do {
            System.out.println("""
                Enter the choice:\s
                +. Add
                -. Div
                /. Mul
                *. Sub
                X. EXIT
                """);

            choice=scanner.next().charAt(0);


            switch (choice) {
                case '+': {
                    add(12, 14);
                    break;
                }
                case '-': {
                    sub(12, 14);
                    break;
                }
                case 'X': {
                    break;
                }
                default: {
                    System.out.println("Invalid Choice: ");
                }
            }
        }
        while (choice!='X');
    }
}
