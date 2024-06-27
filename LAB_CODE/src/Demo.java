
class Computer
{
    String brandName;
    int modelNumber;
    int osVersion;
    String storage;
    String processor;
    String ram;
    float displaySize;
    String displayType;
    String keyboardType;

    public void executingTask()
    {
        System.out.println("Computer task is running");
    }
    public void showComputerDetails()
    {
        System.out.println( "Brand Name: "+ brandName+ "\n" +
                            "Model Number: "+modelNumber +"\n" +
                            "Os version: "+ osVersion+ "\n" +
                            "Storage: "+ storage+ "\n" +
                            "Processor: "+ processor+"\n" +
                            "Ram: "+ ram+ "\n" +
                            "Display Size: "+ displaySize+ "\n" +
                            "Display Type: "+ displayType+ "\n" +
                            "Keyboard Type: "+ keyboardType);
    }

}

public class Demo {

    public static void main(String[] args) {

        Computer computer=new Computer();


        computer.brandName="HP";
        computer.keyboardType="Manual";
        computer.displayType="lcd";
        computer.ram="16 GB";
        computer.processor="Intel RTX";
        computer.storage="2 TB";
        computer.displaySize=15;
        computer.osVersion=11;
        computer.modelNumber=3030;
        System.out.println("CALLING A METHOD: ");
        computer.executingTask();
        System.out.println("Computer Details: ");
        computer.showComputerDetails();
        System.out.println("Another computer : ");

        Computer computer1=new Computer();
        computer1.brandName="ASUS";
        computer1.showComputerDetails();

    }

}
