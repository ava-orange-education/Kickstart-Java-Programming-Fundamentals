class Transaction4 {
    private String id;
    private double amount;
    private String type;

    public Transaction4(String id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return "Transaction[id=" + id + ", amount=" + amount + ", type=" + type + "]";
    }
}
