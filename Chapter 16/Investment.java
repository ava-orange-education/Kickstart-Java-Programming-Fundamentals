class Investment {
    String name;
    double volatility; // Risk indicator

    public Investment(String name, double volatility) {
        this.name = name;
        this.volatility = volatility;
    }

    @Override
    public String toString() {
        return name + " (Volatility: " + volatility + "%)";
    }
}