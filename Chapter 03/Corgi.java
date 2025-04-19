public class Corgi extends Dog {
    int age;

    // Constructor
    public Corgi(String name, String size, int age) {
        super(name, size);  // call to superclass constructor
        this.age = age;
    }

    // Display method
    public void displayInfo() {
        super.displayInfo(); //call to superclass method
        System.out.println("Age :" + age);
    }
}
