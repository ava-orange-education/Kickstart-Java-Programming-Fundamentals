public class ObjectLifespanExample {
    public static void main(String[] args) {
        processAVeryLargeDataset();
    }

    public static void processAVeryLargeDataset() {
        for (int i = 0; i < 24; i++) {
            // Here, we create an object inside the loop's scope
            String data = "Processing data chunk - serial Nbr " + i;
            // This just simulates processing the data chunk
            System.out.println(data);

            // At this point, the 'data' variable goes out of scope,
            // making it eligible for GC
        }
        // Our loop ends here with no unnecessary references 
        // to 'data' 
    }
}
