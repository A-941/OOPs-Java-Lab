abstract class BankAccount {
    protected String accountNumber;
    protected String customerName;
    protected double balance;
    protected final String BANK_NAME = "ABC Bank";

    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public final void displayBankInformation() {
        System.out.println("Bank: " + BANK_NAME);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Customer: " + customerName + ", Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return (balance * interestRate) / 100.0;
    }

    public void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    private double cashbackPercentage;

    public PremiumSavingsAccount(String accountNumber, String customerName, double balance, double interestRate, double cashbackPercentage) {
        super(accountNumber, customerName, balance, interestRate);
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    public double calculateInterest() {
        return ((balance * interestRate) / 100.0) * 1.25;
    }

    public double calculateCashback(double amount) {
        return (amount * cashbackPercentage) / 100.0;
    }
}

final class BankRules {
    public void displayRules() {
        System.out.println("Bank Rules: KYC compliance and minimum balance regulations apply.");
    }
}

public class Program2_BankingDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA1001", "John Doe", 15000, 4.5);
        sa.deposit(5000);
        sa.displaySavingsAccountDetails();
        System.out.println("Savings Account Interest: " + sa.calculateInterest());

        System.out.println();

        PremiumSavingsAccount psa = new PremiumSavingsAccount("PSA2001", "Jane Smith", 50000, 5.0, 2.0);
        psa.deposit(10000);
        psa.displayAccountDetails();
        System.out.println("Premium Interest: " + psa.calculateInterest());
        System.out.println("Cashback on 2000 transaction: " + psa.calculateCashback(2000));

        System.out.println();
        sa.displayBankInformation();

        BankRules rules = new BankRules();
        rules.displayRules();
    }
}
