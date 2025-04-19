import java.util.List;

public class SocialMediaRanking implements RankingStrategy {
    public void rankPrograms(List<String> programs) {
        System.out.println("Ranking programs by social media trends...");
        for (String program : programs) {
            System.out.println(" - " + program);
        }
    }
}