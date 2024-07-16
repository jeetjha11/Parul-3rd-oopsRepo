public class ConstructorInJava {

    String email;
    String phone;

    public ConstructorInJava(String name,String message,String email,String phone)
    {
        System.out.println("NAME:"+ name+"\n" +
                            "Message: "+ message);
        this.email=email;
        this.phone=phone;
    }

    public void display()
    {
        System.out.println("Email: "+ this.email+ "\n" +
                            "Phone number:  "+this.phone);
    }




    // constructor


    public static void main(String[] args) {
        ConstructorInJava constructorInJava=new ConstructorInJava("Rahul","Hii Good Morning","ab@gmail.com","131231");
        constructorInJava.display();

        ConstructorInJava constructorInJava1=new ConstructorInJava("Rahul Gandhi","Hii Good Morning","ab@gmail.com","131231");
        constructorInJava1.display();


    }


}
