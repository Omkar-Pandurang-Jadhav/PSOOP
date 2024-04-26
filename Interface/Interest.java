// Interface for SavingAccount

interface SavingAcc {
    double getSimpleInterest();
}

// Interface for CurrentAccount
interface CurrentAccount {
    double getCompoundInterest();
}

// Class representing a Customer implementing both SavingAccount and CurrentAccount interfaces
class Customer implements SavingAcc, CurrentAccount {
    // Data members for account type, interest rate, and balance
    private String accountType;
    private double interestRate;
    private double balance;

    // Constructor to initialize account type, interest rate, and balance
    public Customer(String accountType, double interestRate, double balance) {
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    // Method to calculate simple interest based on balance
    @Override
    public double getSimpleInterest() {
        return balance * interestRate / 100;
    }

    // Method to calculate compound interest based on balance
    @Override
    public double getCompoundInterest() {
        // Assuming compound interest is calculated annually
        int years = 1;
        return balance * Math.pow((1 + interestRate / 100), years) - balance;
    }
}

public class Interest {
    public static void main(String[] args) {
        // Creating a Customer object for saving account with initial balance of $1000 and interest rate of 5%
        Customer savingCustomer = new Customer("Saving", 5.0, 1000);

        // Creating a Customer object for current account with initial balance of $2000 and interest rate of 3%
        Customer currentCustomer = new Customer("Current", 3.0, 2000);

        // Printing simple interest for saving account
        System.out.println("Simple Interest for Saving Account: $" + savingCustomer.getSimpleInterest());

        // Printing compound interest for current account
        System.out.println("Compound Interest for Current Account: $" + currentCustomer.getCompoundInterest());
    }
}
