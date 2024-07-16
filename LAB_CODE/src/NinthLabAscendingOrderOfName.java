import java.util.Arrays;
import java.util.Scanner;

public class NinthLabAscendingOrderOfName {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of names that you want to take :");
        String []names=new String[scanner.nextInt()];

        for(int i=0;i<names.length;i++)
        {
            System.out.println("Enter names: "+i );
            names[i]=scanner.next();
        }

        // using for each loop displaying values:
        System.out.println("Before Sorting: ");
        for (String name:names)
        {
            System.out.print(name+" ");
        }
        System.out.println();


        //["1","2","3","4"]
        for(int i=0;i<names.length-1;i++)
        {
            for (int j=1;j<names.length;j++)
            {
                if((names[i].compareTo(names[j]))>0)
                {
                    String temp=names[j];
                    names[j]=names[i];
                    names[i]=temp;
                }
            }
        }

//        Arrays.sort(names);
        System.out.println("After sorting: ");
        for (String name:names)
        {
            System.out.print(name+" ");
        }
    }
}
