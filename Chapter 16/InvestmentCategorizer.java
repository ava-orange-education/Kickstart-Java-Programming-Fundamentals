public class InvestmentCategorizer {

    // Method to categorize investments using pattern matching
    public static void categorizeInvestment(Object investment) {
        switch (investment) {
            case Transaction3 txn when txn.amount() > 10000 -> 
                System.out.println("High-Value Investment: " + txn);
            case Transaction3 txn when txn.amount() <= 10000 && txn.amount() > 0 -> 
                System.out.println("Standard Investment: " + txn);
            case String description -> 
                System.out.println("Investment Description: " + description);
            case null -> 
                System.out.println("No Investment Data Available");
            default -> 
                System.out.println("Unknown Investment Type: " + investment);
        }
    }
}
