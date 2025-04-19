import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RiskAssessment {

    public static List<Investment2> filterInvestments(List<Investment2> investments, Predicate<Investment2> strategy) {
        return investments.stream()
                .filter(strategy)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Sample investment data
        List<Investment2> investments = Arrays.asList(
                new Investment2("AI Growth Fund", 12.5),
                new Investment2("BlueCert Stocks", 6.8),
                new Investment2("Cryptocurrency", 22.4),
                new Investment2("Federal Bonds", 2.5)
        );

        // Define different risk strategies using lambda expressions
        Predicate<Investment2> lowRiskStrategy = inv -> inv.getVolatility() < 5;
        Predicate<Investment2> highRiskStrategy = inv -> inv.getVolatility() > 10;

        // Apply strategies dynamically
        List<Investment2> lowRiskInvestments = filterInvestments(investments, lowRiskStrategy);
        List<Investment2> highRiskInvestments = filterInvestments(investments, highRiskStrategy);

        // Output results
        System.out.println("Low-Risk Investments: " + lowRiskInvestments);
        System.out.println("High-Risk Investments: " + highRiskInvestments);
    }
}