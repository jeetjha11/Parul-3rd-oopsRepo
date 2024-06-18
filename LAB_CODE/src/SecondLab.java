import java.util.Scanner;
public class SecondLab
{
    public static void main(String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("Addition Of the Given Number is: "+sum);

        //div
        float div=num1/num2;
        System.out.println("Division of the number is: "+div);

        int mul=num1*num2;
        System.out.println("Multiply of number is: "+mul);

        float mod=num1%num2;
        System.out.println("Reminder of the number is: "+mod);


        //bitwise

        int bitwiseAndResult=num1 & num2;
        System.out.println("Bitwise And Result: "+bitwiseAndResult);

        int bitwiseOrResult=num1|num2;
        System.out.println("Bitwise Or Result: "+bitwiseOrResult);

        int bitwiseXorResult=num1^num2;
        System.out.println("Bitwise Xor Result: "+ bitwiseXorResult);

        int leftShift=num1<<num2;
        System.out.println("Left shift value: "+leftShift);

        int rightShift=num1>>num2;
        System.out.println("Right shift value: "+ rightShift);
    }
}
