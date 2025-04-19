// Singleton class
public class BroadcastScheduler {

    // Private static instance
    private static BroadcastScheduler instance;

    // Private constructor prevents external instantiation
    private BroadcastScheduler() {
        System.out.println("BroadcastScheduler initialized.");
    }

    // Public method to provide global access point
    public static BroadcastScheduler getInstance() {
        if (instance == null) {
            instance = new BroadcastScheduler();
        }
        return instance;
    }

    // Example method to simulate scheduling
    public void scheduleProgram(String channel, String program, String time) {
        System.out.println("Scheduled '" + program + "' on " + channel + " at " + time);
    }
}
