public class AccountManager {
    public static void main(String[] args) {
        // Creat a new RetirementAccount object
        RetirementAccount account = new RetirementAccount("Neo", "UP0021319", 3000);
        
        // Use the object's methods
        account.displayAccountInfo();
        account.deposit(900);
        account.withdraw(120);
    }   
}
