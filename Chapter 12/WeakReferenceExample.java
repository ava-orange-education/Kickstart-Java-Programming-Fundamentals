import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) {
        WeakReference<Data> myWeakData = new WeakReference<>(new Data("Cached Data"));
        
        // Retrieve data from weak reference
        Data data = myWeakData.get();
        System.out.println("Before GC: " + (data != null ? data.value : "null"));
        
        // Suggest garbage collection
        System.gc();
        
        // Try to retrieve data after GC
        data = myWeakData.get();
        System.out.println("After GC: " + (data != null ? data.value : "null"));
    }

    static class Data {
        String value;

        Data(String value) {
            this.value = value;
        }
    }
}
