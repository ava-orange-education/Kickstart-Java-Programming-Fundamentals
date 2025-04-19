public class Staff3 {
    // Method to set the ID using an integer
    public void setID(int staffID) {
        System.out.println("Staff ID set to: " + staffID);
    }

    // Overloaded method to set the ID using a string
    public void setID(String staffID) {
        System.out.println("Staff ID set to: " + staffID);
    }

    public static void main(String[] args) {
        Staff3 staff = new Staff3();
        staff.setID(1001);  // Calls the method with an int parameter
        staff.setID("SN102");  // Calls the method with a String parameter
    }
}
