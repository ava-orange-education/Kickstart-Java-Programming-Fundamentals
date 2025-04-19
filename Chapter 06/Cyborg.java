import java.io.*;

class Cyborg implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int assimilationAge;

    public Cyborg(String name, int assimilationAge) {
        this.name = name;
        this.assimilationAge = assimilationAge;
    }

    @Override
    public String toString() {
        return "Cyborg{name='" + name + "', assimilationAge=" + assimilationAge + '}';
    }
}