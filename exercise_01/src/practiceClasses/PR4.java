package practiceClasses;

import java.util.Arrays;
import java.util.Scanner;

class Computer
{
    /// overloading is same name of the method in same class we can define multiple
    // times with different number of parameter and different type of parameter
    public void display()
    {

    }
    public void display(String name)
    {

    }
    public void display(int age)
    {

    }
    public void display(String name,int age)
    {

    }


}




public class PR4 {

    public static void main(String[] args) {

        Computer computer=new Computer();
        computer.display("abc");
        computer.display(32);





        Scanner scanner=new Scanner(System.in);
        System.out.println("How many names you want to store: ");
        int size=scanner.nextInt();
        String []names=new String[size];

        for(int i=0;i<names.length;i++)
        {
            System.out.println("Enter the name: "+(i+1));
            names[i]=scanner.next();
        }

        System.out.println("Before Sorting");
        // using for each loop for displaying the data
        for(String name:names)
        {
            System.out.print(name+" ");
        }

       // logic for sorting
        //[ 1,   2,     3   ,   4,      5,   6,     7]


        for(int i=0;i< names.length-1;i++)
        {
            for (int j=i+1;j<names.length;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }


        System.out.println("\n After Sorting");
        // using for each loop for displaying the data
        for(String name:names)
        {
            System.out.print(name+" ");
        }




    }

}
