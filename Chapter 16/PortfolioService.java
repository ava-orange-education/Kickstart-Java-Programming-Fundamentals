import java.util.Optional;

class PortfolioService {
    public Optional<Portfolio> getClientPortfolio(String clientId) {
        // Simulating a missing portfolio 
        if (clientId.equals("FIBACLID0319")) {
            return Optional.of(new Portfolio(clientId, 150000.00));
        } else {
            return Optional.empty();
        }
    }
}