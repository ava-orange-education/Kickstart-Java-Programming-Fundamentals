public class BasicProgram implements TVProgram {
    private String title;

    public BasicProgram(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + title);
    }
}
