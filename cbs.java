import java.util.Scanner;

// Interface
interface BankingService {
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    void checkBalance();
}

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Implementation Class
class BankAccount implements BankingService {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class CodingalBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);

        try {
            System.out.println("=== Codingal Banking Services ===");
            account.checkBalance();

            System.out.print("Enter deposit amount: ");
            double deposit = sc.nextDouble();
            account.deposit(deposit);

            account.checkBalance();

            System.out.print("Enter withdrawal amount: ");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);

            account.checkBalance();

        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
        finally {
            System.out.println("Thank you for using Codingal Banking Services.");
            sc.close();
        }
    }
}
