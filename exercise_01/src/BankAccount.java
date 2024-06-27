import java.util.Scanner;

class Account
{
    String holderName;
    String branchName;
    String aadharNumber;
    String phoneNumber;
    int finalBalance;
    String IFSCCode;
    String panCardNumber;
    String accountNumber;
    String accountType;


    //credit
    public void creditAmount(int balance)
    {
        finalBalance=finalBalance+balance;
        System.out.println("Total Balance: "+ balance);
    }

    public void debitAmount(int balance)
    {
        if(balance>finalBalance)
        {
            System.out.println("Invalid Balance Given ");
            return;
        }
        else {
            finalBalance=finalBalance-balance;
        }
    }

    public void viewAccountBalance()
    {
        System.out.println("Total Balance: "+ finalBalance);
    }

    public void displayAccountDetails()
    {
        System.out.println("Account number: "+ accountNumber+ "\n" +
                            "Holder Name: "+ holderName+ "\n" +
                            "Account Balance: "+ finalBalance);
    }


}

public class BankAccount {
    public static void main(String[] args) {

        Account account=new Account();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        account.holderName=scanner.next();
        account.accountNumber="123123adasd";
        System.out.println("Enter the Balance: ");
        account.finalBalance=scanner.nextInt();
        System.out.println("Enter the aadhar number: ");////////////////////////////////////////////////////////////////////////////////////////////////

        account.aadharNumber=scanner.next();
        account.IFSCCode="SBI12312300";
        System.out.println("Enter the pan card Number: ");
        account.panCardNumber=scanner.next();
        System.out.println("Enter the phone number: ");
        account.phoneNumber=scanner.next();

        account.displayAccountDetails();

    }

}
