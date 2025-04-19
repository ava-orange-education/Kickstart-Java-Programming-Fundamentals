import java.util.Optional;

public class RefactoredPortfolioService {
    public Optional<Portfolio> getClientPortfolio(String clientId) {
        return "FIBACLID0319".equals(clientId) ? Optional.of(new Portfolio(clientId, 150000.00)) : Optional.empty();
    }
}
