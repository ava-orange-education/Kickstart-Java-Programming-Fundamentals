public class Staff2 {
    // Method to create a staff record with just an ID
    public void create(int staffID) {
        System.out.println("Staff member created with ID: " + staffID);
    }

    // Overloaded method to create a staff record with ID and name
    public void create(int staffID, String firstName) {
        System.out.println("Staff member created with ID: " + staffID + " and Name: " + firstName);
    }

    // Overloaded method to create a staff record with ID, name, and age
    public void create(int staffID, String firstName, int age) {
        System.out.println("Staff member created with ID: " + staffID + ", Name: " + firstName + ", and Age: " + age);
    }

    public static void main(String[] args) {
        Staff2 staff = new Staff2();
        staff.create(1001);  // Calls the first method
        staff.create(1002, "Trinity");  // Calls the second method
        staff.create(1003, "Morpheus", 32);  // Calls the third method
    }
}
