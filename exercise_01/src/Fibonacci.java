import java.util.Scanner;

public class Fibonacci {

    public  int findNthTermFibonacciNumberByRecursiveMethod(int n) {
        if(n<=1)
        {
            return n;
        }
        else {
            return findNthTermFibonacciNumberByRecursiveMethod(n-1)+findNthTermFibonacciNumberByRecursiveMethod(n-2);
        }

        }

    public  void findNthTermFibonacciNumberByNonRecursiveMethod(int n)
    {
        // 0 1
        if(n<=1)
        {
            System.out.println("Fibonacci number at Nth position is: "+ n);
        }
        else {
            int first=0;
            int second=1;
            int next=0;
            System.out.print(first+" "+ second+ " ");
            for(int i=2;i<=n;i++)
            {
                next=first+second;
                first=second;
                second=next;
                System.out.print(next+" ");
            }
            System.out.println("\n");
            System.out.println("Nth terms Fibonacci Number is: "+ next);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the terms value which you want to find the Fibonacci number: ");
        int term= scanner.nextInt();
        fibonacci.findNthTermFibonacciNumberByNonRecursiveMethod(term);

        System.out.println("By Recursive method: ");
        int result=fibonacci.findNthTermFibonacciNumberByRecursiveMethod(term);
        System.out.println("Nth terms Fibonacci Number is: "+ result);
    }
}
