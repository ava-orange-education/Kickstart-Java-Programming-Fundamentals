package SLAP_LMS;
public class User {
    protected String name;
    protected int userID;

    public User(String name, int userID) {
        this.name = name;
        this.userID = userID;
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name + ", User ID: " + userID);
    }
}