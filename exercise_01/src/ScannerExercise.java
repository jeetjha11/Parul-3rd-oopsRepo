import java.util.Scanner;
public class ScannerExercise {

    public static void main(String[] args) {
        // creating object for the Scanner class

//        String address,gender,name,num;
        Scanner sc= new Scanner(System.in);
//        System.out.println("enter your number:");
//        num=sc.nextLine();
//        System.out.println("enter your name :");
//        name=sc.nextLine();
//        System.out.println("enter your address:");
//        address= sc.nextLine();
//        System.out.println("enter your gender:");
//        gender= sc.nextLine();
//        System.out.println("number="+num);
//        System.out.println("name="+name);
//        System.out.println("gender="+gender);
//        System.out.println("address="+address);

        System.out.println("Enter the hit in C for Gujarat: ");
        float guj=sc.nextFloat();
        System.out.println("Enter the hit in C Bihar: ");
        float Bih=sc.nextFloat();
        System.out.println("Enter the hit in C Mumbai: ");
        float Mum=sc.nextFloat();
        System.out.println("Enter the hit in C Delhi: ");
        float Del=sc.nextFloat();

        float averageHit=(guj+Mum+Bih+Del)/4;
        if(averageHit>35)
        {
            System.out.println("TOOOOOOOO HIGH ");
        } else if (averageHit<29) {
            System.out.println("too Normal");
        } else{
            System.out.println("Normal Whether");
        }
//
//        String message=(age>18) && (age<100)?"You are eligible for vote":"You are not eligible for the vote";
//        System.out.println(message);




    }

}
