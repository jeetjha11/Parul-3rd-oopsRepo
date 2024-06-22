import java.util.Scanner;
public class Dummy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float number1= scanner.nextFloat();
        System.out.println("Enter second Number: ");
        float number2= scanner.nextFloat();

        // add
        float sum=number1+number2;
        System.out.println("Sum is: "+ sum);
        // mul

        //sub

        //div

        //reminder


        //bitwise
        //and--> &
        System.out.println("Enter first number for bitwise Operations: ");
        int bitwiseFirstNumber= scanner.nextInt();
        System.out.println("Enter Second number for bitwise Operations: ");
        int bitwiseSecondNumber= scanner.nextInt();
        float bitwiseAnd=bitwiseFirstNumber & bitwiseSecondNumber;
        System.out.println("Bitwise And result is: "+ bitwiseAnd);
        //or---> |
        // xor---> ^
        int bitwiseOr=bitwiseFirstNumber | bitwiseSecondNumber;
        System.out.println("Bitwise Or result is: "+ bitwiseOr);
        //leftshift--> >>
        //right shift--> <<

    }
}
