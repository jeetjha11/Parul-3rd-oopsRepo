import java.util.Scanner;

public class HRMS {


    String name;
    String id;
    String gender;

    static String org="Parul";
    int age;

    HRMS(String name,String id,String gender,int age)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.gender=gender;



    }

    public  void display()
    {
        System.out.println("Name of the people: "+ this.name+"\n" +
                            "age: "+ this.age+ "\n" +
                            "Gender: "+ this.gender+"\n" +
                            "Id: "+ this.id+"\n" +
                            "Organization: "+ org);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=scanner.next();
        System.out.println("Enter the gender: ");
        String gender= scanner.next();
        System.out.println("Enter the age: ");
        int age= scanner.nextInt();
        System.out.println("Enter the id: ");
        String id=scanner.next();
        HRMS hrms=new HRMS(name,id,gender,age);
        HRMS hrms1=new HRMS("arjun","120","male",12);
        HRMS hrms2=new HRMS("Sila","123","Female",32);
        hrms.org="abc";
        hrms.display();

        System.out.println("\n");
        hrms1.display();
        System.out.println("\n");
        hrms2.display();

//        display();
    }


}
