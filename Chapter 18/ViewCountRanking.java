import java.util.List;

public class ViewCountRanking implements RankingStrategy {
    public void rankPrograms(List<String> programs) {
        System.out.println("Ranking programs by hourly view count...");
        // Placeholder logic
        for (String program : programs) {
            System.out.println(" - " + program);
        }
    }
}
