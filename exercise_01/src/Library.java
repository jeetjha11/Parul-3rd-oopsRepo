import java.util.Scanner;

public class Library {
    // instance variable
    String type;
    String location;
    String libraryName;
    int numberOfStudyRoom;
    int libraryId;


    public void display()
    {
        System.out.println("Library Name: "+ libraryName+ "\n" +
                            "Library Type: "+ type + "\n" +
                            "Library Location: "+ location + "\n" +
                            "Number of Study Room: "+ numberOfStudyRoom+ "\n" +
                            "Library Id: "+ libraryId);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        System.out.println("Enter the library type");
        library.type=sc.next();
        System.out.println("Enter the library Id");
        library.libraryId=sc.nextInt();
        System.out.println("Enter the library Name");
        library.libraryName=sc.next();
        System.out.println("Enter the library Study Room");
        library.numberOfStudyRoom=sc.nextInt();
        System.out.println("Enter the library Location");
        library.location=sc.next();
        library.display();

        System.out.println("Second Object:::::");

        Library l1=new Library();
        l1.type="Manual";
        l1.display();

        System.out.println("first object:  ");
        library.display();
    }
}
