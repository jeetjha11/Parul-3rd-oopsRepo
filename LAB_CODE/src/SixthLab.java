import java.util.Scanner;

public class SixthLab {

    public  static  int findNthFibonacciNumberByRecursiveMethod(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else {

           int result=findNthFibonacciNumberByRecursiveMethod(n-1)+findNthFibonacciNumberByRecursiveMethod(n-2);
            System.out.print(result+" ");
            return result;
        }
    }

    public static void findNthFibonacciNumberByNonRecursiveMethod(int n)
    {
        // 0 1 1 2  3
        int first=0;
        int second=1;
        int third=0;
        System.out.print(first+" "+ second+" ");
        if(n<=1)
        {
            System.out.print("Fibonacci Number at nth Position:  "+ n);
        }
        for(int i=2;i<=n;i++)
        {
            third=first+second;
            first=second;
            second=third;
            System.out.print(third+" ");
        }
        System.out.println("Last Nth term value is: "+ third);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Nth term Value for (n): ");
        int n= scanner.nextInt();
        findNthFibonacciNumberByNonRecursiveMethod(n);

        System.out.println("Method By Recursive");

       int lastFibonacciNumber= findNthFibonacciNumberByRecursiveMethod(n);
        System.out.println("Last Fibonacci number is: "+ lastFibonacciNumber);

    }
}
