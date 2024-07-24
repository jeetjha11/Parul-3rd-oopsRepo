package practiceClasses;

import java.util.Scanner;

public class PR7 {
    public static void main(String[] args) {
        int [][]c=new int[3][3];

       int [][] a= new int[][]{{1, 2, 3}, {4, 5, 6}, {1, 4, 5}};
       int [][] b= new int[][]{{1, 2, 3}, {4, 5, 6}, {1, 4, 5}};

       //Multiplication
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }
    }

}
