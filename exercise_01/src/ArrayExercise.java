import java.util.Scanner;

public class ArrayExercise {


    public static void main(String[] args) {
        // int type dynamic array
//        int [] arrName=new int[size]
        int [] numbers=new int[6];
        System.out.println("length of numbers arr: "+ numbers.length);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the values:");
        numbers[0]= scanner.nextInt();
        numbers[1]= scanner.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Enter the element: ");
            numbers[i]= scanner.nextInt();
        }

        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");

        }

    }
}
