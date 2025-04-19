import java.util.*;

public class StrategyExample {
    public static void main(String[] args) {
        List<String> programs = Arrays.asList("Evening News", "Drama Hour", "Sports Central");

        ProgramRanker ranker = new ProgramRanker();

        ranker.setStrategy(new ViewCountRanking());
        ranker.rank(programs);

        ranker.setStrategy(new SocialMediaRanking());
        ranker.rank(programs);
    }
}