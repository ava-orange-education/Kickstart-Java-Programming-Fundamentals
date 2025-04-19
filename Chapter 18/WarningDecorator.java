
public class WarningDecorator extends ProgramDecorator {
    public WarningDecorator(TVProgram program) {
        super(program);
    }

    @Override
    public void play() {
        System.out.println("[Parental Advisory: Some content may be inappropriate]");
        super.play();
    }
}