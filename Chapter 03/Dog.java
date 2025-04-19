// Superclass
public class Dog {
    String name;
    String size;

    // Constructor
    public Dog(String name, String size) {
        this.name = name;
        this.size = size;
    }

    // Method to display dog details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Size: " + size);
    }
}
