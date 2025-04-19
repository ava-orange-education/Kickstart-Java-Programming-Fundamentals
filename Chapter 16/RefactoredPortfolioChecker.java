public class RefactoredPortfolioChecker {
    public static void main(String[] args) {
        RefactoredPortfolioService service = new RefactoredPortfolioService();

        // Safely retrieve the portfolio value using Optional
        double portfolioValue = service.getClientPortfolio("FIBACLID0123")
                .map(Portfolio::getTotalValue)
                .orElse(0.0);

        System.out.println("Client Portfolio Value: $" + portfolioValue);
    }
}