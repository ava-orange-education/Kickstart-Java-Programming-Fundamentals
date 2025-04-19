import java.util.List;

public class ProgramRanker {
    private RankingStrategy strategy;

    public void setStrategy(RankingStrategy strategy) {
        this.strategy = strategy;
    }

    public void rank(List<String> programs) {
        if (strategy != null) {
            strategy.rankPrograms(programs);
        } else {
            System.out.println("No ranking strategy selected.");
        }
    }
}
