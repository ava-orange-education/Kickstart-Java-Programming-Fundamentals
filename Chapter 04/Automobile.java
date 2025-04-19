public class Automobile {
    public static void main(String[] args) {
        Drivable truck = new Truck();
        Drivable bus = new Bus();

        // Polymorphic behavior
        truck.drive();  // Output: The Truck is driving.
        bus.drive();  // Output: The is driving.
    }
}
