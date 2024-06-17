import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float englishMarks,mathMarks,scienceMarks,socialScienceMarks,hindi;
        while(true)
        {
            System.out.println("Enter the marks for english");
            englishMarks=scanner.nextFloat();
            if(!(englishMarks<0 || englishMarks>100))
            {
                break;
            }
            else {
                System.out.println("Marks should be in range of 0-100");
            }
        }

        while(true)
        {
            System.out.println("Enter the marks for Math");
            mathMarks=scanner.nextFloat();
            if(!(mathMarks<0 || mathMarks>100))
            {
                break;
            }
            else {
                System.out.println("Marks should be in range of 0-100");
            }
        }


        while(true)
        {
            System.out.println("Enter the marks for Science");
            scienceMarks=scanner.nextFloat();
            if(!(scienceMarks<0 || scienceMarks>100))
            {
                break;
            }
            else {
                System.out.println("Marks should be in range of 0-100");
            }
        }


        while(true)
        {
            System.out.println("Enter the marks for Social Science");
            socialScienceMarks=scanner.nextFloat();
            if(!(socialScienceMarks<0 || socialScienceMarks>100))
            {
                break;
            }
            else {
                System.out.println("Marks should be in range of 0-100");
            }
        }


        while(true)
        {
            System.out.println("Enter the marks for Hindi");
            hindi=scanner.nextFloat();
            if(!(hindi<0 || hindi>100))
            {
                break;
            }
            else {
                System.out.println("Marks should be in range of 0-100");
            }
        }

        float averagePercentage=(mathMarks+hindi+socialScienceMarks+scienceMarks+englishMarks)/5;
        if(averagePercentage>=60 && averagePercentage<=70)
        {
            System.out.println("You Got Grade A with "+averagePercentage+" percentage");
        } else if (averagePercentage>70 && averagePercentage<=80) {
            System.out.println("You Got Grade A+ with "+averagePercentage+" percentage");

        } else if (averagePercentage<50) {
            System.out.println("You are Fail With"+averagePercentage+" percentage");


        }
        else {
            System.out.println("invalid Percentage!!!!!");
        }
    }
}
