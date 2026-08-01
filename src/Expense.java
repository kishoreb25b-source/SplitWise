public class Expense {
    private final String payerName;
    private final  Double Amount;
    Expense(String Payer,Double amount){
        this.payerName=Payer;
        this.Amount=amount;
    }

    public String getPayerName() {
        return payerName;
    }

    public Double getAmount() {
        return Amount;
    }
}
