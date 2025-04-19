public class FIBAOptionalExample {
    public static void main(String[] args) {
        PortfolioService service = new PortfolioService();

        // Safely retrieve the portfolio value
        String clientId = "FIBACLID0123"; // A client without an active portfolio
        double portfolioValue = service.getClientPortfolio(clientId)
                .map(Portfolio::getTotalValue)
                .orElse(0.0);  // Default value if no portfolio exists

        System.out.println("Client Portfolio Value: $" + portfolioValue);
    }
}