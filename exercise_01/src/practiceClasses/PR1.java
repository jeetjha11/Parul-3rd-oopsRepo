package practiceClasses;

import java.util.Scanner;

public class PR1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("How many names you want to take input: ");
        int size=scanner.nextInt();
        String [] names=new String[size];
        // taking elements input for the names array
        for(int i=0;i< names.length;i++)
        {
            names[i]=scanner.next();
        }
        // printing names array before the sorting using for-each loop
        for(String name:names)
        {
            System.out.print(name+" ");
        }

        //   [ "abc",   "def",    "ghi",    "lmn",  "mno"]

        for(int i=0;i< names.length-1;i++)
        {
            for (int j=i+1;j< names.length;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    String  temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }


    }

}