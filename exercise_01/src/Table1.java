import java.util.Scanner;

public class Table1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float engMarks;
        float mathMarks;
        while (true) {
            System.out.println("Enter the marks for English: ");
            engMarks = scanner.nextInt();

            if (engMarks >= 0 && engMarks <= 100) {
                break;
            } else {
                System.out.println("Given Marks is invalid Please Enter Again!!");
            }
        }

        while (true) {
            System.out.println("Enter the marks for English: ");
            mathMarks = scanner.nextInt();

            if (mathMarks >= 0 && mathMarks <= 100) {
                break;
            } else {
                System.out.println("Given Marks is invalid Please Enter Again!!");
            }
        }

        float avg=(engMarks+mathMarks)/2;
        System.out.println("Average Percentage: "+ avg);
    }
}
