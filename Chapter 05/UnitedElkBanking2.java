public class UnitedElkBanking2 {
    private double balance;

    public UnitedElkBanking2(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("You cannot deposit a negative amount.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, ZeroBalanceException {
        if (balance == 0) {
            throw new ZeroBalanceException("Account balance is zero. Withdraw not permitted.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
    }

    public void checkBalance() {
        System.out.println("Your current balance: $" + balance);
    }

    public static void main(String[] args) {
        UnitedElkBanking2 account = new UnitedElkBanking2(100);
    
        try {
            // Attempt to deposit funds
            account.deposit(50);
            account.checkBalance();
    
            // Attempt to withdraw more than the available balance to trigger an exception
            account.withdraw(200);
        } catch (NegativeDepositException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ZeroBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    
        // Attempt another withdrawal to check ZeroBalanceException handling
        try {
            account.withdraw(150);
            account.checkBalance();
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ZeroBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
