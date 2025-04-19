package utils;

public class DependenciesChecker {

    public static void main(String[] args) {
        checkSQLite();
        checkWeka();
        checkJavaFX();
    }

    private static void checkSQLite() {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("[✓] SQLite JDBC Driver is available.");
        } catch (ClassNotFoundException e) {
            System.err.println("[✗] SQLite JDBC Driver not found.");
        }
    }

    private static void checkWeka() {
        try {
            Class.forName("weka.core.Instances");
            System.out.println("[✓] Weka Library is available.");
        } catch (ClassNotFoundException e) {
            System.err.println("[✗] Weka Library not found.");
        }
    }

    private static void checkJavaFX() {
        try {
            Class.forName("javafx.application.Application");
            System.out.println("[✓] JavaFX is available.");
        } catch (ClassNotFoundException e) {
            System.err.println("[✗] JavaFX is not available.");
        }
    }
}
