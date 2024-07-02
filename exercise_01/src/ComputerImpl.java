import java.util.Scanner;

class Computer1
{
    String name;
    String model;
    String color;
    String processor;
    String ram;



    public void displayComputerDetails()
    {
        System.out.println("Name: "+ name+"\n" +
                            "Model: "+ model+"\n" +
                            "Color: "+ color+"\n" +
                            "Processor: "+processor+"\n" +
                            "Ram: "+ram);
    }
}

public class ComputerImpl {

    public static void main(String[] args) {
//        Computer1 computer1=new Computer1();
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the name of Computer Device:");
//        computer1.name= scanner.next();
//        System.out.println("Enter the model name: ");
//        computer1.model= scanner.next();
//        System.out.println("Enter the color for device: ");
//        computer1.color= scanner.next();
//        System.out.println("Enter the Processor: ");
//        computer1.processor= scanner.next();
//        System.out.println("Enter the Ram: ");
//        computer1.ram= scanner.next();
//        computer1.displayComputerDetails();

        int []arr={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }

        }


        int []  ages=new int[5];
        for(int i=0;i<ages.length;i++)
        {
            System.out.println("Enter the age: "+ i);
            ages[i]=scanner.nextInt();
        }

        for(int i=0;i< ages.length;i++)
        {
            if(ages[i]>18)
            {
                System.out.println(ages[i]);
            }
        }
    }
}


/*
datatype [] arrayName={element1, element2,element3};
int [] numbers={1, 2, 3, 4, 5};
                0  1  2  3  4---------> index
                arrayName[index]
                numbers[3]--> 4
                length=5
                size=5
                index=4
                ArrayOutOfBoundException


     2nd way for the array:
        syntax:
            dataType [] arrayName=new dataType[size]
            int [] arr=new int[500];
            float [] array=new float[6];
            String [] names=new String[3];

            arr[0]=1;
            arr[1]=3;
            arr[2]=4;
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=scanner.nextInt();
            }







* */
