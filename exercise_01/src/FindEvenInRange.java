import java.util.Scanner;

public class FindEvenInRange {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the stating range: ");
        int starting_range=sc.nextInt();
        System.out.println("Enter the ending Range: ");
        int endingRange=sc.nextInt();

        for(int i=starting_range;i<=endingRange;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }

        }

    }
}
