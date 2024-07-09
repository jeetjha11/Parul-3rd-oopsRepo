import java.util.Queue;

public class Bike {
    String name;
    String enginType;

    String model;

    String color;
    // default constructor
//    Bike()
//    {
//        System.out.println("Bike Object is getting created: ");
//    }

    Bike(String bikeName,String enginType,String model)
    {
        this.name=bikeName;
        this.enginType=enginType;
        this.model=model;

    }
    Bike(String color)
    {
        this.color=color;
    }
    Bike()
    {

    }

    public  void diplay()
    {
        System.out.println("name: "+ this.name+ "\n" +
                        "Model: "+ this.model+ "\n" +
                        "Engin Type: "+ this.enginType+ "\n" +
                        "Color"+ this.color);
    }
    public static void main(String[] args) {
        Bike bike=new Bike("Honda","Petrol","wqeqw");
        Bike bike1=new Bike("Hero","Petrol","wqeqw");
        Bike bike2=new Bike("abc","Petrol","wqeqw");
        bike2.diplay();
        bike1.diplay();
        bike.diplay();
        Bike bike3=new Bike();
        Bike bike4=new Bike("Red");
        bike4.diplay();
    }
}
