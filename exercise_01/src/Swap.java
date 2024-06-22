import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int firstNumber= sc.nextInt();
        System.out.println("Enter he second Number: ");
        int secondNumber=sc.nextInt();

        System.out.println("Before Swapping\n" +
                            "first number: "+
                 firstNumber+ " "+ "Second Number: "+ secondNumber);


        int temp=0;
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;

        System.out.println("After Swapping\n" +
                "first number: "+
                firstNumber+ " "+ "Second Number: "+ secondNumber);


    }
}
