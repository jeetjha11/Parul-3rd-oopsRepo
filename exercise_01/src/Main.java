
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the Age: ");
            int age=scanner.nextInt();
            if(age>18 && age<=100)
            {
                System.out.println("You are eligible for vote");
                break;
            }
            else if(age<18 && age>=0){
                System.out.println("You are Not Eligible");
                break;
            }
            else if(age>100 || age<0) {
                System.out.println("Invalid Age:");
            }
        }

    }
}
