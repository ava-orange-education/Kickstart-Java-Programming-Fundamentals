public class ObserverExample {
    public static void main(String[] args) {
        BreakingNewsAgency agency = new BreakingNewsAgency();

        NewsObserver mobile = new MobileApp();
        NewsObserver web = new WebsiteTicker();

        agency.subscribe(mobile);
        agency.subscribe(web);

        agency.notifySubscribers("Breaking: Championship Game Postponed!");

        agency.unsubscribe(web);

        agency.notifySubscribers("Update: New Airtime Announced for Game");
    }
}