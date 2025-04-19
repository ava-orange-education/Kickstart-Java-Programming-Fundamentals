import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvestmentFiltering {
    public static void main(String[] args) {
        List<Investment> investments = Arrays.asList(
                new Investment("Tech Growth Fund", 12.5),
                new Investment("BlueChip Stocks", 6.8),
                new Investment("Cryptocurrency", 22.4),
                new Investment("Government Bonds", 2.5)
        );

        // Filter high-risk investments (volatility > 10%)
        List<Investment> highRiskInvestments = investments.stream()
                .filter(inv -> inv.volatility > 10)
                .collect(Collectors.toList());

        System.out.println("High-Risk Investments: " + highRiskInvestments);
    }
}