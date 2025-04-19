public class MobileApp implements NewsObserver {
    public void update(String news) {
        System.out.println("Mobile App Alert: " + news);
    }
}
