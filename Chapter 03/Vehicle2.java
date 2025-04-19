public class Vehicle2 {
    // Private attributes (fields)
    private String type;
    private String make;
    private String model;
    private int year;
    
    // Constructor
    public Vehicle2(String type, String make, String model, int year) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Getter for 'type'
    public String getType() {
        return type;
    }
    
    // Setter for 'type'
    public void setType(String type) {
        this.type = type;
    }
    
    // Getter for 'make'
    public String getMake() {
        return make;
    }
    
    // Setter for 'make'
    public void setMake(String make) {
        this.make = make;
    }
    
    // Getter for 'model'
    public String getModel() {
        return model;
    }
    
    // Setter for 'model'
    public void setModel(String model) {
        this.model = model;
    }
    
    // Getter for 'year'
    public int getYear() {
        return year;
    }
    
    // Setter for 'year'
    public void setYear(int year) {
        this.year = year;
    }
    
    // Method to display attributes
    public void displayAttributes() {
        System.out.println("Type: " + getType() + ", Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear());
    }
    
}
