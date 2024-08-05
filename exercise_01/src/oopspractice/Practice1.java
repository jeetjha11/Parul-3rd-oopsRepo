package oopspractice;

import java.util.Scanner;
class Account
{
    String accountNumber;
    String accountHolderName;
    String branchName;
    String branchId;
    double balance;
    String ifscCode;


    public void displayAccountDetails()
    {
        System.out.println("Account Number:"+accountNumber+"\n" +
                "Account Holder Name: "+accountHolderName+"\n" +
                "Branch Name: "+branchName+"\n" +
                "Branch Id: "+branchId+"\n" +
                "Balance: "+balance+"\n" +
                "IFSC Code: "+ifscCode);
    }
    public void debitAmount()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount for debit: ");
        double tempDebitAmount=scanner.nextDouble();
        if(tempDebitAmount>balance)
        {
            System.out.println("Insufficient Fund: Please Enter again>>");
            debitAmount();
        }
        else {
            balance=balance-tempDebitAmount;
            System.out.println("Transaction Successful: \n" +
                    "Total Available Balance:  "+ balance);
        }
    }
    public void creditAmount()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount for credit: ");
        double tempCreditAmount=scanner.nextDouble();
        if(tempCreditAmount<0)
        {
            System.out.println("Invalid Credit Amount Given Please Enter again>>");
            creditAmount();
        }
        else {
            balance=balance+tempCreditAmount;
            System.out.println("Amount Credited Successfully: \n" +
                    "Total Balance: "+ balance);
        }
    }
    public void viewBalance()
    {
        System.out.println("Balance: "+balance);
    }
}


public class Practice1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Account account=new Account();
        System.out.println("Enter the Holder name");
        account.accountHolderName=scanner.next();
        System.out.println("Enter the balance: ");
        account.balance=scanner.nextDouble();
        System.out.println("Enter the Branch name");
        account.branchName=scanner.next();
        System.out.println("Enter the Branch id:");
        account.branchId=scanner.next();
        System.out.println("Enter the ifsc code ");
        account.ifscCode=scanner.next();
        System.out.println("Enter the Account Number: ");
        account.accountNumber=scanner.next();

        System.out.println("Credit Amount: ");
        account.creditAmount();
        System.out.println("Debit AAmount: ");
        account.debitAmount();
        System.out.println("View Balance: ");
        account.viewBalance();

        System.out.println("Account Details: ");
        account.displayAccountDetails();

    }
}