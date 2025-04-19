import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FIBAFunctionalExample {
    public static void main(String[] args) {
        List<Transaction2> transactions = Arrays.asList(
            new Transaction2("TXNF001", 5000),
            new Transaction2("TXNF002", 15000),
            new Transaction2("TXNF003", 13500),
            new Transaction2("TXNF004", 8000)
        );

        // Define a predicate for high-value transactions (above $10,000)
        Predicate<Transaction2> isHighValue = txn -> txn.getAmount() > 10000;

        // Filter high-value transactions using Streams and Predicate
        List<Transaction2> highValueTxns = transactions.stream()
                .filter(isHighValue)
                .collect(Collectors.toList());

        System.out.println("High-Value Transactions: " + highValueTxns);
    }
}