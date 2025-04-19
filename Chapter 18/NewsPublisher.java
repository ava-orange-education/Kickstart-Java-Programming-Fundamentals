public interface NewsPublisher {
    void subscribe(NewsObserver observer);
    void unsubscribe(NewsObserver observer);
    void notifySubscribers(String news);
}
