public class UnitedElkBanking {
    private double withdrawalAmount;
    private double balance;

    public UnitedElkBanking(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void withdraw(double amount) throws ZeroBalanceException {
        if (balance == 0) {
            throw new ZeroBalanceException("Zero Balance. Unable to withdraw: " + withdrawalAmount);
        }
    }
}
