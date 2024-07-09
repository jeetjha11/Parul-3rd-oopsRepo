import java.util.Scanner;

public class FourthLab {

    String name;
    String email;
    String designation;
    String phoneNumber;



    public void display()
    {
        System.out.println("Name:" +this.name+"\n" +
                            "Email"+ this.email+ "\n" +
                            "Phone Number: "+ this.phoneNumber+"\n" +
                            "Designation: "+ this.designation);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FourthLab fourthLab=new FourthLab();
        System.out.println("Enter the employee name: ");
        fourthLab.name=scanner.next();
        System.out.println("Enter the email: ");
        fourthLab.email=scanner.next();
        System.out.println("Enter the Phone Number: ");
        fourthLab.phoneNumber=scanner.next();
        System.out.println("Enter the designation: ");
        fourthLab.designation=scanner.next();
        System.out.println("Employee Details: ");
        fourthLab.display();
    }
}
