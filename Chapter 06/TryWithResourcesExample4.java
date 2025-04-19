public class TryWithResourcesExample4 {
    public static void main(String[] args) {
        try (CustomResource resource = new CustomResource()) {
            resource.use();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}