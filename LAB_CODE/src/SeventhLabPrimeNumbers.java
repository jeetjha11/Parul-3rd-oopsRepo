import java.util.Scanner;

public class SeventhLabPrimeNumbers {


    public void findPrimenumbers(int term)
    {
        // 2-term=10
        // i= 2  3  4  5  6  7  8  9  10
        for(int i=2;i<=term;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+ " ");
            }
        }

    }
    // number  2
    public static boolean isPrime(int number)
    {

        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return  true;


    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Term(integer)");
        int term=scanner.nextInt();

        SeventhLabPrimeNumbers seventhLabPrimeNumbers=new SeventhLabPrimeNumbers();
        seventhLabPrimeNumbers.findPrimenumbers(term);



    }


}
