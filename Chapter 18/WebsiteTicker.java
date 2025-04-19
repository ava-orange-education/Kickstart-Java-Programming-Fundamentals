public class WebsiteTicker implements NewsObserver {
    public void update(String news) {
        System.out.println("Website Ticker Update: " + news);
    }
}