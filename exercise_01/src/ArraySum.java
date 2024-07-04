import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] marks=new int[6];
        for (int i=0;i< marks.length;i++)
        {
            System.out.println("Entre the marks: ");
            marks[i]= scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i< marks.length;i++)
        {
            sum=sum+ marks[i];
        }
        System.out.println("Sum of all the marks : "+ sum);

    }
}
