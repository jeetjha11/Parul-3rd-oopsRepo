import java.util.Scanner;

public class ArrayFindMax {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []numbers=new int[9];

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Enter the "+ i +" Elements");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Enter the Target Element: ");
        int target= scanner.nextInt();

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>target)
            {
                System.out.println(numbers[i]+ " ");
            }
        }
    }
}
