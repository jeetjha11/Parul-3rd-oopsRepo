import java.util.Scanner;
public class ForLoopCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting point: ");
        int start=sc.nextInt();
        int end=0;
        while(true)
        {
            System.out.println("Enter the ending point: ");
            end=sc.nextInt();
            if(!(end<=start))
            {
                break;
            }
            else{
                System.out.println("Ending Point Should be greater then Starting Point: ");
            }
        }

        //start=23
        //end==29    29  28 27 25 23 24 23

        for(int i=end;i>=start;i--)
        {
            System.out.print(i+" ");
        }

    }

}
