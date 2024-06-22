

// if a method and a variable is defined inside the class then for accessing we need to create the object of
//the class
class Fan
{
    String name;
    String type;
    String model;
    String blade;



    public void isOn()
    {
        System.out.println("Fan is on");
    }
    public void isOff()
    {
        System.out.println("Fan is off");
    }
}






public class Function {
    // simple function which is displaying the greetings

    String name;
    public void greeting()
    {
        System.out.println("Hii, Good Evening");
    }


    public static void main(String[] args) {
       Fan fan=new Fan();
       fan.blade="3";
       fan.name="Usha11";
       fan.model="001";
       fan.type="roof fan";

       fan.isOff();
       fan.isOn();

        System.out.println("Model: "+fan.model);






    }
}
