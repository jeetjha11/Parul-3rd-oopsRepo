package practiceClasses;

import java.util.Scanner;

public class PR7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [][]a=new int [3][3];
        int [][]b=new int[3][3];
        int [][]c=new int [3][3];

        //Taking values for a matrices
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println("Enter the element for a Matrices for ["+i+"]["+j+"] Position");
                a[i][j]=scanner.nextInt();
            }

        }
        // Taking values for the b matrices
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println("Enter the element for b Matrices for ["+i+"]["+j+"] Position");
                b[i][j]=scanner.nextInt();
            }

        }

        // Logic For Multiplication
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        //Displaying the resultant matrices
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }

}
