class Transaction2 {
    private String id;
    private double amount;

    public Transaction2(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public double getAmount() { return amount; }
    @Override
    public String toString() { return "Transaction " + id + ": $" + amount; }
}