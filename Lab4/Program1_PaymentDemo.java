interface Payment {
    void makePayment(double amount);
    void generateReceipt();
    void displayPaymentDetails();
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    private double lastAmount;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        this.lastAmount = amount;
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt: Paid $" + lastAmount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Method: Credit Card, Card Number: " + cardNumber);
    }
}

class UPIPayment implements Payment {
    private String upiId;
    private double lastAmount;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void makePayment(double amount) {
        this.lastAmount = amount;
        System.out.println("Processing UPI payment of $" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt: Paid $" + lastAmount + " via UPI ID " + upiId);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Method: UPI, ID: " + upiId);
    }
}

class NetBankingPayment implements Payment {
    private String bankName;
    private double lastAmount;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void makePayment(double amount) {
        this.lastAmount = amount;
        System.out.println("Processing Net Banking payment of $" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt: Paid $" + lastAmount + " through " + bankName);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Method: Net Banking, Bank: " + bankName);
    }
}

public class Program1_PaymentDemo {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment("4111222233334444");
        p.makePayment(2500);
        p.generateReceipt();
        p.displayPaymentDetails();

        System.out.println();

        p = new UPIPayment("user@oksbi");
        p.makePayment(1200);
        p.generateReceipt();
        p.displayPaymentDetails();

        System.out.println();

        p = new NetBankingPayment("HDFC Bank");
        p.makePayment(5000);
        p.generateReceipt();
        p.displayPaymentDetails();
    }
}
