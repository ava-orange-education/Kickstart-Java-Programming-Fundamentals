class Investment2 {
    private String name;
    private double volatility; // Risk level indicator (higher = riskier)

    public Investment2(String name, double volatility) {
        this.name = name;
        this.volatility = volatility;
    }

    public double getVolatility() { return volatility; }

    @Override
    public String toString() {
        return name + " (Volatility: " + volatility + "%)";
    }
}
