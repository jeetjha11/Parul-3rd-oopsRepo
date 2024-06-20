import java.util.Scanner;

public class MarksValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float mathMarks=0.0f;
        float engMarks=0.0f;

        while(true)
        {
            System.out.println("Enter the marks for English: ");
            engMarks=sc.nextInt();

            if(engMarks<0 || engMarks>100)
            {
                System.out.println("Given Marks is invalid Please Enter Again:");
            }
            else
            {
                break;
            }
        }

        while (true)
        {
            System.out.println("Enter the marks for Math");
            mathMarks=sc.nextInt();
            if(mathMarks<0 || mathMarks>100)
            {
                System.out.println("Given Marks is invalid Please Enter Again:");
            }
            else {
                break;
            }
        }

        float avg=(engMarks+mathMarks)/2;

        System.out.println("Average Percentage: = "+ avg);

    }
}
