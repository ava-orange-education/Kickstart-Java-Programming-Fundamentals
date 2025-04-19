class SportsChannel extends Channel {
    public TVProgram createProgram() {
        return new SportsProgram();
    }
}