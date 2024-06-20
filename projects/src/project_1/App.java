package project_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.print("1. Mathematical Operations\n" +
                               "2. Bitwise Operations\n" +
                               "3. Exit");

            int outer_choice=sc.nextInt();

            if(outer_choice==1)
            {
                System.out.println("Performing Math Operations");
                while (true)
                {
                    System.out.println("1. Addition\n" +
                                       "2. Sub\n" +
                                       "3. Division\n" +
                                        "4. Multiplication\n" +
                                       "5. Reminder\n" +
                                        "6. Exit");


                    int innerChoiceOne=sc.nextInt();
                    if(innerChoiceOne==1)
                    {
                        System.out.println("addition");
                    } else if (innerChoiceOne==2) {
                        System.out.println("sub");

                    } else if (innerChoiceOne==3) {
                        System.out.println("division");
                    } else if (innerChoiceOne==4) {
                        System.out.println("multiplication");
                    } else if (innerChoiceOne==5) {
                        System.out.println("reminder");
                    } else if (innerChoiceOne==6) {
                        break;
                    }
                    else {
                        System.out.println("Invalid Choice Given!!");
                    }

                }
            } else if (outer_choice==2) {
                System.out.println("Performing Bitwise Operations");
                while (true)
                {
                    System.out.println("1. Bitwise And\n" +
                            "2. Bitwise Or\n" +
                            "3.Bitwise Xor\n" +
                            "4. Bitwise left shift\n" +
                            "5. Bitwise right shift\n" +
                            "6. Exit\n");


                    int innerChoiceTwo=sc.nextInt();
                    if(innerChoiceTwo==1) {

                        System.out.println("Bitwise And");
                    }else if (innerChoiceTwo==2) {
                        System.out.println("Bitwise Or");
                    } else if (innerChoiceTwo==3) {
                        System.out.println("Bitwise Xor");
                    } else if (innerChoiceTwo==4) {
                        System.out.println("Right Shift");
                    } else if (innerChoiceTwo==5) {
                        System.out.println("Left Shift");

                    } else if (innerChoiceTwo==6) {
                        break;
                    } else {
                        System.out.println("Invalid Choice Given!!");
                    }

                }


            } else if (outer_choice==3) {
                System.out.println("Thankyou");
                break;
            }
            else {
                System.out.println("Invalid Choice given!!");
            }
        }
    }
}
