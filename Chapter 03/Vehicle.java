public class Vehicle {
    // Attributes (fields)
    String type;
    String make;
    String model;
    int year;
    
    // Constructor
    public Vehicle(String type, String make, String model, int year) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Method (behavior)
    public void displayAttributes() {
        System.out.println("Type: " + type + ", Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}
