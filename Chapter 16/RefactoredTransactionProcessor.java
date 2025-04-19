import java.util.List;
import java.util.stream.Collectors;

public class RefactoredTransactionProcessor {
    public static void main(String[] args) {
        List<Transaction4> transactions = List.of(
                new Transaction4("TXNF001", 5000, "Stock Purchase"),
                new Transaction4("TXNF002", 15000, "Bond Purchase"),
                new Transaction4("TXNF003", 25000, "Crypto Purchase")
        );

        // Using Streams to filter high-value transactions
        List<Transaction4> highValueTransactions = transactions.stream()
                .filter(txn -> txn.getAmount() > 10000)
                .collect(Collectors.toList());

        System.out.println("High-Value Transactions: " + highValueTransactions);
    }
}
