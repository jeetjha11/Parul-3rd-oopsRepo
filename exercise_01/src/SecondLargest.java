import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int [] arr=new int[scanner.nextInt()];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        int max=arr[0];
        int secondMax=arr[1];

        for (int value:arr)
        {
            if(value>max)
            {
                secondMax=max;
                max=value;

            }
            else  if(value>secondMax && value!=max){
                secondMax=value;

            }
        }
        System.out.println("Second Max: "+ secondMax);
    }

}
