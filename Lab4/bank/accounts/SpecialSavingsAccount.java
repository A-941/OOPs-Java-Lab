package bank.accounts;

public class SpecialSavingsAccount extends SavingsAccount {
    private double specialBonusRate;

    public SpecialSavingsAccount(String accountNumber, String accountHolderName, double balance, double specialBonusRate) {
        super(accountNumber, accountHolderName, balance);
        this.specialBonusRate = specialBonusRate;
    }

    public void displaySpecialDetails() {
        System.out.println("Subclass accessing protected member accountHolderName: " + accountHolderName);
        System.out.println("Special Bonus Rate: " + specialBonusRate + "%");
    }
}
