import java.util.Scanner;

public  class Dummy
{


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//
//        int [][]a;
//        int [][]b;
//        int [][]c;
//        a=new int[3][3];
//        b=new int[3][3];
//        c=new int[3][3];
//
//
//        System.out.println("Ente the value for a matrics");
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                a[i][j]=scanner.nextInt();
//            }
//        }
//        System.out.println("Ente the value for b matrics");
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                b[i][j]=scanner.nextInt();
//            }
//        }
//
//        System.out.println("Ente the value for a matrics");
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                c[i][j]=0;
//                for(int k=0;k<3;k++)
//                {
//                    c[i][j]+=a[i][k]*b[k][j];
//                }
//            }
//        }
//
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                System.out.print(a[i][j]+ "\t");
//            }
//            System.out.println();
//        }

        System.out.println("Enter the value: ");
        int n= scanner.nextInt();

        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+ " ");
            }
        }





    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
