public class Main {
    public static void main(String[] args) {
        double TotalAmt=500.0;
        int TotalFriend=3;
        String PayerName="Kishore";
        double SingleShare=TotalAmt/TotalFriend;
        String ExpenseLine= PayerName +" paid:"+TotalAmt;
        String EachShare="Each person need to pay:"+SingleShare;
        System.out.println("====SplitWise====");
        System.out.println("Welcome to SplitWise");
        System.out.println("Track shares with Friends");
        System.out.println();
        System.out.println("Ready.");
        System.out.println("Total in Person:"+TotalFriend);
        System.out.println(ExpenseLine);
        System.out.println(EachShare);
    }
}