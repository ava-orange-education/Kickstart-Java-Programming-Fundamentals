public static void main(String[] args) {
    LegacyPortfolioService service = new LegacyPortfolioService();
    Portfolio2 portfolio = service.getClientPortfolio("FIBACLID0123");

    // Manual null check
    double portfolioValue = (portfolio != null) ? portfolio.getTotalValue() : 0.0;

    System.out.println("Client Portfolio Value: $" + portfolioValue);
}
