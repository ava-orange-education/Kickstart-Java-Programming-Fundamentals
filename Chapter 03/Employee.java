public class Employee {
    // Fields
    String name;
    int age;
    String position;
    
    // Constructor 1 - default constructor
    public Employee() {
        this("Not identified", 0); // calls Constructor 2 with default values
    }
    
    // Constructor 2 - accepts name and age
    public Employee(String name, int age) {
        this(name, age, "Not identified"); // calls Constructor 3 with default position
    }

    // Constructor 3 - accepts name, age, and position
    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    
    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Position: " + position);
    }
}
