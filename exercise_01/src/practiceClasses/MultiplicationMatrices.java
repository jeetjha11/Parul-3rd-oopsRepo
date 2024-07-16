package practiceClasses;

import java.util.Scanner;

class MultiplicationMatrices
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [][] a=new int[3][3];
        int [][]b=new int[3][3];

        int [][]c=new int[3][3];

        // take input from user for matrices a and b
        System.out.println("Input value for a matrices");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value for ["+i+"]["+j+"] position");
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("input value for b matrices");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value for ["+i+"]["+j+"] position");
                b[i][j]=scanner.nextInt();
            }
        }

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
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }

}