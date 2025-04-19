public class RefactoredInvestmentRecordExample {
    public static void main(String[] args) {
        RefactoredInvestment3 inv = new RefactoredInvestment3("INV001", 25000.00, "Mutual Funds");
        System.out.println(inv); // Output: Investment[id=INV001, amount=25000.0, category=Mutual Funds]
    }
}