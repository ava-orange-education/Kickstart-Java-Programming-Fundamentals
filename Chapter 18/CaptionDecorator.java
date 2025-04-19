public class CaptionDecorator extends ProgramDecorator {
    public CaptionDecorator(TVProgram program) {
        super(program);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("[Captions Enabled]");
    }
}