class Portfolio2 {
    private String clientId;
    private double totalValue;

    public Portfolio2(String clientId, double totalValue) {
        this.clientId = clientId;
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }
}