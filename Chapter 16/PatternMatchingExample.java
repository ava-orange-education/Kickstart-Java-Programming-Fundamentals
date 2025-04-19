public class PatternMatchingExample{
    public static void main(String[] args) {
        // Create transaction instances
        Transaction3 highValueTxn = new Transaction3("TXNF2002", 15000.00, "Bond Purchase");
        Transaction3 standardTxn = new Transaction3("TXNF2003", 5000.00, "Stock Purchase");

        // Execute pattern matching on different investment scenarios

        // High-value investment
        InvestmentCategorizer.categorizeInvestment(highValueTxn);   
        // Standard investment     
        InvestmentCategorizer.categorizeInvestment(standardTxn);       
        // Investment description  
        InvestmentCategorizer.categorizeInvestment("Mutual Fund");    
        // No investment data available   
        InvestmentCategorizer.categorizeInvestment(null); 
        // Unknown investment type               
        InvestmentCategorizer.categorizeInvestment(42);                  
    }
}
