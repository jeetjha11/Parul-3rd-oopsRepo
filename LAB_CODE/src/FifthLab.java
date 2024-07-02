import java.util.Scanner;

public class FifthLab {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter the value for b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter the value for c: ");
        double c=scanner.nextDouble();

        //b*b-4ac
        double discriminant=b*b-4*a*c;
        System.out.println("Discriminant value is: "+ discriminant);
        if(discriminant<0)
        {
            System.out.println("There are no real solutions");
        }
    }
}
