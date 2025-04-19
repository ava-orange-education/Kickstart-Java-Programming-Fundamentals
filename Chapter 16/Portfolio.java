class Portfolio {
    private String clientId;
    private double totalValue;

    public Portfolio(String clientId, double totalValue) {
        this.clientId = clientId;
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }
}