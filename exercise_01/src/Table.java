import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Table Number: ");
        int table=scanner.nextInt();

        for(int i=1;i<=10;i++)
        {
            //                   5   *  1=      5
            System.out.println(table+ "*"+ i+" = "+table*i);
        }
    }
}
