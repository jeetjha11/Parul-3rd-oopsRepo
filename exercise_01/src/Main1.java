import java.util.Scanner;

public class Main1
{
    public static void main(String[] args) {
        float math=0;
        float english=0;
        float hindi=0;
        float socialScience=0;
        float science=0;

        //creating the object for scanner class
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the marks for Math:" );
            math=sc.nextInt();
            if(math>0 &&  math<100)
            {
                break;
            }
            else
            {
                System.out.println("Given Marks is invalid Please Enter again: ");
            }

        }
        while(true)
        {
            System.out.println("Enter the marks for English:" );
            english=sc.nextInt();
            if(english>0 &&  english<100)
            {
                break;
            }
            else
            {
                System.out.println("Given Marks is invalid Please Enter again: ");
            }

        }
        while(true)
        {
            System.out.println("Enter the marks for Social Science:" );
            socialScience=sc.nextInt();
            if(socialScience>0 &&  socialScience<100)
            {
                break;
            }
            else
            {
                System.out.println("Given Marks is invalid Please Enter again: ");
            }

        }
        while(true)
        {
            System.out.println("Enter the marks for Science:" );
            science=sc.nextInt();
            if(science>0 &&  science<100)
            {
                break;
            }
            else
            {
                System.out.println("Given Marks is invalid Please Enter again: ");
            }

        }
        while(true)
        {
            System.out.println("Enter the marks for Hindi:" );
            hindi=sc.nextInt();
            if(hindi>0 &&  hindi<100)
            {
                break;
            }
            else
            {
                System.out.println("Given Marks is invalid Please Enter again: ");
            }

        }


        float averagePercentage=(math+hindi+english+socialScience+science)/5;


        if(averagePercentage>=60  &&  averagePercentage<=70)
        {
            System.out.println("You Got "+averagePercentage+ " With A Grade");
        }
        else if(averagePercentage>70 && averagePercentage<=90)
        {
            System.out.println("You Got "+averagePercentage+ " With A++ Grade");

        }
        else if(averagePercentage<60)
        {
            System.out.println("Cong You Are Fail!!!!!!!!!");

        }





    }
}
