public class DecoratorPatternExample {
    public static void main(String[] args) {
        TVProgram program = new BasicProgram("Science Documentary");

        // Add parental warning
        program = new WarningDecorator(program);

        // Add captions
        program = new CaptionDecorator(program);

        program.play();
    }
}