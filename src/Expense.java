public class Expense {
    private String payerName;
    private  Double Amount;
    Expense(String Payer,Double amount){
        this.payerName=Payer;
        this.Amount=amount;
    }
    public Expense(Double amount){
        this("Unknown",amount);
    }

    public String getPayerName() {
        return payerName;
    }

    public Double getAmount() {
        return Amount;
    }
}
