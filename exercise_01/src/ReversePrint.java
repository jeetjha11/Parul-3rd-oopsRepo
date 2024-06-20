import java.util.Scanner;
public class ReversePrint
{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Starting point: ");
        int start=scanner.nextInt();
        System.out.println("Enter the End point: ");
        int end=scanner.nextInt();
        // i 23          21
        for(int i=end;i>=start;i--)
        {
            System.out.println(i);
        }
    }
}