public class SimpleFactoryExample {
    public static void main(String[] args) {
        TVProgram news = ProgramFactory.createProgram("news");
        TVProgram sports = ProgramFactory.createProgram("sports");

        news.play();
        sports.play();
    }
}