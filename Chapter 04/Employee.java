public class Employee implements Identifiable {
    private int employeeID;
    
    public Employee(int id) {
        this.employeeID = id;
    }
    
    // Implementing the getID method
    @Override
    public int getID() {
        return this.employeeID;
    }
    
    // Using the default method from the interface
    public void displayID() {
        showID(this.employeeID);
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee(10005);
        System.out.println("Employee ID: " + employee.getID());
        employee.displayID();  // Uses default method from Identifiable
    }
}
