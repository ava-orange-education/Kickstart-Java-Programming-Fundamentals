// Simple Factory
public class ProgramFactory {
    public static TVProgram createProgram(String type) {
        switch (type.toLowerCase()) {
            case "news": return new NewsProgram();
            case "sports": return new SportsProgram();
            case "comedy": return new ComedyProgram();
            case "drama": return new DramaProgram();
            default: throw new IllegalArgumentException("Unknown program type: " + type);
        }
    }
}