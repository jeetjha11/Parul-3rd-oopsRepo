class Computer
{

}

public class Fan1 {

    String type;
    String model;

    public void display()
    {
        System.out.println("Type of the fan is: "+ type+ "\n" +
                            "Model of the Fan is: "+ model);
    }

    public static void main(String[] args) {

        // classname  objectname=  new classname();
        //  objectname.propertiesName

        //creating object for fan class
        Fan1 fan1=new Fan1();
        fan1.type="Table Fan";
        fan1.model="Usha";
        System.out.println("Table Fan");
        fan1.display();


        Fan1 fan12=new Fan1();
        fan12.type="Stand Fan";
        fan12.model="Usha";
        System.out.println("Stand FAN");
        fan12.display();

    }
}
