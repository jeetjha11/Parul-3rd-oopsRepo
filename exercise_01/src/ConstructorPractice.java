import java.sql.Struct;



class Bike1{
    String name;
    String model;

    public Bike1(String name,String model)
    {
        this.name=name;
        this.model=model;

    }
    public  Bike1()
    {

    }

    public void display()
    {
        System.out.println("NAME: " + this.name+ "\n" +
                            "Model: "+ this.model);
    }
}









class Student1
{
    String name;
    String email;
    String gender;

//    public Student1()
//    {
//        System.out.println("Hii Object for student is created:");
//
//    }

    public Student1(String name,String email,String gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }



    public  void display()
    {
        System.out.println("name: "+  this.name +"\n" +
                            "Email: "+ this.email+ "\n" +
                            "Gender: "+ this.gender);
    }
}




public class ConstructorPractice {
    public static void main(String[] args) {
        Student1 student1=new Student1("abc","abc@gmail.com","Male");
        student1.display();
        Student1 student2=new Student1("Disha","disha@gmail.com","Female");
        student2.display();


        Bike1 bike1=new Bike1("abc","Honda");
        bike1.display();
        Bike1 bike11=new Bike1();
    }

}
