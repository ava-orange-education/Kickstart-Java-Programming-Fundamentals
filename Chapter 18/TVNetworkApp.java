class TVNetworkApp {
    public static void main(String[] args) {
        // Get Singleton instance and schedule a program
        BroadcastScheduler scheduler = BroadcastScheduler.getInstance();
        scheduler.scheduleProgram("Channel 5", "Morning News", "7:00 AM");

        // Get the Singleton instance again and schedule another program
        BroadcastScheduler anotherScheduler = BroadcastScheduler.getInstance();
        anotherScheduler.scheduleProgram("Channel 7", "Evening Show", "8:00 PM");

        // Confirm both references are the same instance
        System.out.println("Same instance? " + (scheduler == anotherScheduler)); // should print true
    }
}