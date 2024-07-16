import javax.swing.plaf.ScrollPaneUI;

class Employee1
{
    String empName;
    String email;
    String address;
    String phoneNumber;
    String designation;

    String experience;
    boolean isPfAccount;
    String achievement;

    public  Employee1(String name,String email,String address,String phoneNuber,String  designation)
    {
        this.empName=name;
        this.email=email;
        this.phoneNumber=phoneNuber;
        this.address=address;
        this.designation=designation;

    }
    public Employee1(String name,String email,String address,String phoneNuber,String designation,String experience,boolean pfAccount)
    {
        this.empName=name;
        this.email=email;
        this.phoneNumber=phoneNuber;
        this.address=address;
        this.designation=designation;

        this.experience=experience;

        this.isPfAccount=pfAccount;
    }

    public Employee1(String  name, String email)
    {
        this.empName=name;
        this.email=email;
    }

    public Employee1(String name,String email,String address,String phoneNuber,String designation,String experience,boolean pfAccount,String achievement)
    {
        this.empName=name;
        this.email=email;
        this.phoneNumber=phoneNuber;
        this.address=address;
        this.designation=designation;

        this.experience=experience;

        this.isPfAccount=pfAccount;

        this.achievement=achievement;
    }


    public  void display()
    {
        System.out.println("name: "+this.empName+" \n" +
                "Email: "+this.email+" \n" +
                "Phone number: "+this.phoneNumber+" \n" +
                "Address: "+this.address+" \n" +
                "Designation: "+this.designation+"\n" +
                "Experience: "+this.experience+"\n" +
                "IsPfAccount: "+ this.isPfAccount+" \n" +
                "Achievement: "+ this.achievement);
    }


}


public class TenthLabConstructorAndMethodOverloading {
    public static void main(String[] args) {

        Employee1 e1=new Employee1("abc","abc@gmail.com");
        e1.designation="Developer";
        e1.display();
        System.out.println();
        Employee1 e2=new Employee1("abc","abc@gmail.com","Gujarat","12313123","HR");
        e2.display();
        System.out.println();

        Employee1 e3=new Employee1("abc","abc@gmail.com","Gujarat","12313123","HR","4 year",true);
        e3.display();
        System.out.println();
        Employee1 e4=new Employee1("abc","abc@gmail.com","Gujarat","12313123","HR","4 year",true,"Gold");
        e4.display();
    }

}
