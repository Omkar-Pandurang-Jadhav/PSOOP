/*
There is an abstract class Account
Attribute:-
● Name
● Balance
● Acc_No
Method:-
● Deposit - abstract method
● withdraw - abstract method
● display - abstract method
Saving Account inherits the
 Account class and provides the implementation for the methods accordingly
Saving Account class Attribute:-
● interestRate
● minBalance
Method
● addInterest: handle Arithmetic Exception
● transfer():
Note:
● Balance cannot be less than 0.
● In a Saving account if minBalance is set then for that the balance
cannot go less than that amount. If it goes, an error must be shown.
● let the user deposit to or withdraw from the account. For each
transaction, a message is displayed to indicate the status of the
transaction: successful or failed. In case of failure, the failure
reason is reported.
● The possible Exceptions are negative-amount-exception (in both
deposit and withdraw transaction) and insufficient-amount-
exception ( in withdraw transaction).
For the above scenario write an interactive program in Java.
Also, show output for different use cases.
 */
package spit.java;
import java.util.Scanner;

class negativeAmountException extends Exception{
    public negativeAmountException(String message){
        super(message);
    }
}
class minBalanceException extends Exception{
  public minBalanceException(String message){
      super(message);
  }
}
abstract class Account{
    String name;
    int Balance;
    int Acc_no;
    Account(String name,int Balance,int Acc_no){
        this.name=name;
        this.Balance=Balance;
        this.Acc_no=Acc_no;
    }
  abstract void Deposit(int d);
    abstract void Withdraw(int w);
    abstract void Display();
}
class SavingAccount extends Account{
    int interestRate;
    int minBalance;
    SavingAccount(String name,int Balance,int Acc_no){

        super(name,Balance,Acc_no);
    }
    public void Deposit(int d){
        Balance=Balance+d;
    }
    public void Withdraw(int w){
        Balance=Balance-w;
    }
    public void Display(){
        System.out.println("The balance ammount in the bank of account number "+Acc_no+" is "+Balance);
    }

}
public class BankExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,w,n;
        String name;
        int Balance;
        int Acc_no;
        System.out.println("Enter bank Details-");
        System.out.println("Enter the name -");
        name=sc.next();
        System.out.println("Enter the balance of your bank Account-");
        Balance=sc.nextInt();
        System.out.println("Enter the Account number");
        Acc_no=sc.nextInt();
        SavingAccount s = new SavingAccount(name,Balance,Acc_no);
        s.minBalance=500;

        System.out.println("Enter 1 if want to deposit money in the bank or 2 for withdrawing money from the Bank.");
        n=sc.nextInt();
        if(n==1){
            System.out.println("Enter the amount you want to deposit.");
            d=sc.nextInt();
            s.Deposit(d);
            s.Display();
            try {
                if (s.minBalance > s.Balance) {
                    throw new minBalanceException("The balance in bank account is less than the minimum value 500 rupees.");
                }
                try {
                    if (s.Balance < 0) {
                        throw new negativeAmountException("The balance of bank account cannot be negative");
                    }
                }catch(negativeAmountException e){
                    System.out.println(e.getMessage());
                    System.out.println("The failure in transaction.");
                }
                System.out.println("Successful transaction has been done.");
            }catch(minBalanceException e1){
                System.out.println("Min Balance Exception.");
                System.out.println(e1.getMessage());
                System.out.println("The failure in transaction.");
            }
        }
        else if(n==2){
            System.out.println("Enter the amount you want to withdraw.");
            w=sc.nextInt();
            s.Withdraw(w);
            s.Display();
            try {
                if (s.Balance < 0) {
                    throw new negativeAmountException("The balance of bank account cannot be negative");
                }
                try {
                    if (s.minBalance > s.Balance) {
                        throw new minBalanceException("You cant withdraw this much amount on money due minBalanceException.");
                    }
                }catch(minBalanceException e2){
                    System.out.println("Min Balance Exception.");
                    System.out.println(e2.getMessage());
                    System.out.println("The failure in transaction.");
                }
                System.out.println("Successful transaction has been done.");
            }catch(negativeAmountException e3){
                System.out.println(e3.getMessage());
                System.out.println("The failure in transaction.");
            }
        }

    }
}
