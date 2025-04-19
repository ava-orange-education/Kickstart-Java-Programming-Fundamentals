public abstract class ProgramDecorator implements TVProgram {
    protected TVProgram program;

    public ProgramDecorator(TVProgram program) {
        this.program = program;
    }

    public void play() {
        program.play();
    }
}
