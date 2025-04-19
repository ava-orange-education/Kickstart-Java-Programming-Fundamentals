package main;

public class AIAnalyzer {
    public static String suggestPriority(String description) {
        if (description == null) return "Low";

        String lower = description.toLowerCase();
        if (lower.contains("urgent") || lower.contains("asap") || lower.contains("deadline")) {
            return "High";
        } else if (lower.contains("soon") || lower.contains("important")) {
            return "Medium";
        }
        return "Low";
    }
}
