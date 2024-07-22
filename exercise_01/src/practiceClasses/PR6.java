package practiceClasses;

import java.util.Scanner;

public class PR6 {

    public  static boolean isPrime(int number)
    {
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                return  false;
            }
        }
        return true;
    }




    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter an integer: ");
         int n=scanner.nextInt();
        System.out.println("Prime number up to "+n+":");
        //  10-> 2 3 4 5 6 7 8 9 10
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }


    }




}
