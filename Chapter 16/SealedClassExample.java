public class SealedClassExample {
    public static void main(String[] args) {
        InvestmentRisk risk = new HighRisk();
        System.out.println(((HighRisk) risk).getRiskLevel()); // Output: High-Risk Investment
    }
}