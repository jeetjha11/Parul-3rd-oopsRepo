package practiceClasses;

import java.util.Scanner;

public  class FindPrimeNumber{

    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scanner.nextInt();
        for(int i=2;i<=n;i++)
        {
           if(isPrime(i))
           {
               System.out.print(i+" ");
           }
        }
    }

}