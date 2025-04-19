import java.util.*;

public class BreakingNewsAgency implements NewsPublisher {
    private List<NewsObserver> subscribers = new ArrayList<>();

    @Override
    public void subscribe(NewsObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(NewsObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String news) {
        for (NewsObserver observer : subscribers) {
            observer.update(news);
        }
    }
}
