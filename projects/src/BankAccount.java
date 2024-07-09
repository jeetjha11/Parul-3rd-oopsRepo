import java.util.Scanner;



class Account
{

}

public class BankAccount {

    public static void main(String[] args) {
        int choice=-1, transactionChoice=-1;


        do {
            System.out.println("Welcome to the Bank: ");
            Scanner scanner=new Scanner(System.in);

            System.out.println( "1. Create an Account"+"\n" +
                    "2. Update Account: "+ "\n" +
                    "3. Delete an Account: "+ "\n" +
                    "4. View Account by number: "+ "\n" +
                    "5. View All Account: "+"\n" +
                    "6. Choose Transaction: "+"\n" +
                    "7. Exit");

            System.out.println("Choose An Options: ");
            choice= scanner.nextInt();

            switch (choice)
            {
                case 1:
                {
                    System.out.println("creating a new account: ");
                    break;
                }
                case 2:
                {
                    System.out.println("Updating a account details: ");
                    break;
                }
                case 3:
                {
                    System.out.println("deleting the details :");
                    break;
                }
                case 4:
                {
                    System.out.println("view account by number: ");
                    break;
                }
                case 5:
                {
                    System.out.println("View all account: ");
                    break;
                }
                case 6:
                {
                    do {
                        System.out.println( "1. Credit Amount: "+"\n" +
                                "3. Debit Amount: "+ "\n" +
                                "3. View Account Details: "+"\n" +
                                "4. Exit.");

                        System.out.println("Please Choose An Option: ");
                        transactionChoice= scanner.nextInt();

                        switch (transactionChoice) {
                            case 1 -> {
                                System.out.println("Credit amount: ");
                                break;
                            }
                            case 2 -> {
                                System.out.println("Debit Amount:");
                                break;
                            }
                            case 3 -> {
                                System.out.println("View Account balance:");
                                break;
                            }
                            case 4 -> {
                                System.out.println("Exit");
                                break;
                            }
                        }
                    }
                    while (transactionChoice!=4);
                }
                case 7:
                {
                    System.out.println("Thankyouuu");
                    break;
                }
            }
        }
        while (choice!=7);
    }
}
