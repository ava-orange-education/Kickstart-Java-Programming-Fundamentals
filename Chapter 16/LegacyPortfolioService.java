class LegacyPortfolioService {
    public Portfolio2 getClientPortfolio(String clientId) {
        if ("FIBACLID0319".equals(clientId)) {
            return new Portfolio2(clientId, 150000.00);
        }
        return null; // Risky approach leading to NullPointerException
    }
}