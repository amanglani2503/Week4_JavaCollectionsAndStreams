package day5junit.advance.bankingsystem;

public class BankingSystem {
    private double balance;

    public BankingSystem(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankingSystem account = new BankingSystem(500);
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(200);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(100);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        try {
            account.withdraw(700);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
