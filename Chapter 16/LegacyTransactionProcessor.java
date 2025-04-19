import java.util.ArrayList;
import java.util.List;

public class LegacyTransactionProcessor {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("TXN001", 5000, "Stock Purchase"));
        transactions.add(new Transaction("TXN002", 15000, "Bond Purchase"));
        transactions.add(new Transaction("TXN003", 25000, "Crypto Purchase"));

        // Finding high-value transactions (above $10,000) using a loop
        List<Transaction> highValueTransactions = new ArrayList<>();
        for (Transaction txn : transactions) {
            if (txn.getAmount() > 10000) {
                highValueTransactions.add(txn);
            }
        }

        System.out.println("High-Value Transactions: " + highValueTransactions);
    }
}