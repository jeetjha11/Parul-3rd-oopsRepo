import java.util.Scanner;

public class Student {

    String name;
    String email;
    String enrollmentNumber;
    String phoneNumber;
    String gender;
    int age;



    public void doingStudy()
    {
        System.out.println("Student is doing Study");

    }
    public void displayStudentData()
    {
        System.out.println( "Name: "+name+ "\n" +
                            "Email: "+ email+ "\n" +
                            "Enrollment Number: "+ enrollmentNumber+ "\n" +
                            "Phone Number: "+ phoneNumber+ "\n" +
                            "Gender: "+ gender+ "\n" +
                            "Age: "+age);
    }

    public static void main(String[] args) {
        Student student1=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
        student1.name=scanner.next();
        System.out.println("Enter the Gender: ");
        student1.gender=scanner.next();
        System.out.println("Enter the phone number: ");
        student1.phoneNumber=scanner.next();

        student1.enrollmentNumber="1000001";
        System.out.println("Enter the age: ");
        student1.age=scanner.nextInt();

        student1.displayStudentData();


        Student student2=new Student();


        System.out.println("Enter the name");
        student2.name=scanner.next();
        System.out.println("Enter the Gender: ");
        student2.gender=scanner.next();
        System.out.println("Enter the phone number: ");
        student2.phoneNumber=scanner.next();

        student2.enrollmentNumber="1000001";
        System.out.println("Enter the age: ");
        student2.age=scanner.nextInt();

        student2.displayStudentData();

    }
}
