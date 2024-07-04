import java.util.Scanner;

public  class Dummy
{

    public  int findFibonacciNumberOfNthTermByRecursiveMethod(int n)
    {

        if(n<=1)
        {
            return n;
        }
        else {
            return findFibonacciNumberOfNthTermByRecursiveMethod(n-1)+findFibonacciNumberOfNthTermByRecursiveMethod(n-2);

        }



    }

    public void findFibonacciNumberOfNthTermByNonRecursiveMethod(int n) {

        double first = 0;
        double second = 1;
        double next=0;

        System.out.print( first + " " + second + " ");

        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print((int) next + " ");

        }
        System.out.println("Nth Term Value of Fibonacci is: " + next);

    }
    public static void main(String[] args) {

        Dummy dummy=new Dummy();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the terms: ");
        dummy.findFibonacciNumberOfNthTermByNonRecursiveMethod(scanner.nextInt());

        System.out.println("By recursive Function: ");
        int result=dummy.findFibonacciNumberOfNthTermByRecursiveMethod(scanner.nextInt());
        System.out.println("Result is: "+ result);
    }


    }
