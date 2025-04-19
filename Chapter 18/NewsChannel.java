class NewsChannel extends Channel {
    public TVProgram createProgram() {
        return new NewsProgram();
    }
}