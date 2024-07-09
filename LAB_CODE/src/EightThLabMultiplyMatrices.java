import java.util.Scanner;

public class EightThLabMultiplyMatrices {

    public static void main(String[] args) {
        int [][]a=new int[3][3];
        int [][]b=new int[3][3];
        int[][]c=new int[3][3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the elements for a :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value for: ["+i+"] ["+j+"] position");
                a[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Enter the elements for b :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value for: ["+i+"] ["+j+"] position");
                b[i][j]=scanner.nextInt();
            }
        }

        // multiplying the matrices
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

        System.out.println("Result of multiply for Matrices a  and b: (a*b=c)");
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
