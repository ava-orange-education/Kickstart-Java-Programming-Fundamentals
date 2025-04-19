public class FactoryMethodExample {
    public static void main(String[] args) {
        Channel newsChannel = new NewsChannel();
        TVProgram news = newsChannel.createProgram();
        news.play();

        Channel sportsChannel = new SportsChannel();
        TVProgram sports = sportsChannel.createProgram();
        sports.play();
    }
}