public class EmployeeManagement {
    public static void main(String[] args) {
        // use default constructor
        Employee employee1 = new Employee();
        employee1.displayInfo(); 

        // use Constructor 2 with two parameters
        Employee employee2 = new Employee("Trinity", 24);
        employee2.displayInfo(); 
 
        // use Constructor 3 with two parameters
        Employee employee3 = new Employee("Neo", 32, "The One");
        employee3.displayInfo(); 
    }
}
