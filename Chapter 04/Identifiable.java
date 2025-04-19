public interface Identifiable {
    // Abstract method
    int getID();

    // Default method
    default void showID(int id) {
        System.out.println("ID: " + id);
    }
}
