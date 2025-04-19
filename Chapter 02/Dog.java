public class Dog {
    // Instance variable
    private String dogName;

    // Constant
    private static final int MAX_AGE = 50;

    // Constructor to initialize dogName
    public Dog(String dogName) {
        this.dogName = dogName;
    }

    // Method using a local variable
    public void outputDogData() {
        int dogAge = 8; // Local variable
        System.out.println("The dog's name is " + 
          dogName + ", and it is " + dogAge + " years old.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Brandy");
        dog.outputDogData();
    }
}