class SharedAccount {
    private int balance;

    public SharedAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(String userName, int amount) {
        System.out.println(userName + " attempting to withdraw $" + amount + " (Current Balance: $" + balance + ")");
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            balance -= amount;
            System.out.println(userName + " successfully withdrew $" + amount + ". Remaining Balance: $" + balance);
        } else {
            System.out.println(userName + " transaction failed! Insufficient funds. Balance: $" + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class UserWithdrawTask implements Runnable {
    private SharedAccount account;
    private String userName;
    private int amount;

    public UserWithdrawTask(SharedAccount account, String userName, int amount) {
        this.account = account;
        this.userName = userName;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(userName, amount);
    }
}

public class Program3_BankWithdrawRaceCondition {
    public static void main(String[] args) {
        SharedAccount account = new SharedAccount(1000);

        Thread user1 = new Thread(new UserWithdrawTask(account, "User 1", 400));
        Thread user2 = new Thread(new UserWithdrawTask(account, "User 2", 500));
        Thread user3 = new Thread(new UserWithdrawTask(account, "User 3", 300));

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Account Balance: $" + account.getBalance());
    }
}
