package bank.application;

import bank.accounts.SavingsAccount;
import bank.accounts.SpecialSavingsAccount;
import bank.operations.BankOperations;

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA9876", "Rahul Verma", 10000.0);

        sa.displayAccountDetails();
        sa.deposit(3000.0);
        sa.withdraw(2000.0);
        sa.withdraw(15000.0);
        System.out.println("Current Balance: " + sa.checkBalance());

        System.out.println();
        SpecialSavingsAccount ssa = new SpecialSavingsAccount("SSA1234", "Pooja Sharma", 25000.0, 3.5);
        ssa.displaySpecialDetails();

        System.out.println("\nAccess Modifier Verification from bank.application.BankApplication:");
        System.out.println("Public method sa.displayAccountDetails() is accessible.");
        System.out.println("Protected field 'accountHolderName' cannot be accessed directly from this different package.");
        System.out.println("Private fields 'accountNumber' and 'balance' cannot be accessed directly from outside SavingsAccount.");
    }
}
