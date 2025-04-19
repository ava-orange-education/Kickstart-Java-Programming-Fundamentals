public class Staff {
    private int id;

    // Method with a primitive parameter (int)
    public void setID(int newID) {
        this.id = newID;
    }
    
    // Method with an object parameter (Staff)
    public void copyID(Staff anotherStaffMember) {
        this.id = anotherStaffMember.id;
    }

    public void showID() {
        System.out.println("Staff ID: " + id);
    }

    public static void main(String[] args) {
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        staff1.setID(3330319);   // Passing a primitive value
        staff2.copyID(staff1);  // Passing an object reference
        staff2.showID();   // Outputs staff1's ID
    } 
}
