import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount");
        double TotalAmt = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Payer Name");
        String PayerName = input.nextLine();
        int TotalFriend = 3;
        double SingleShare = TotalAmt / TotalFriend;
        String ExpenseLine = "%s Paid: %.2f".formatted(PayerName, TotalAmt);
        String EachShare = "Each person need to pay:" + "%.2f".formatted(SingleShare);
        System.out.println("====SplitWise====");
        System.out.println("Welcome to SplitWise");
        System.out.println("Track shares with Friends");
        System.out.println();
        System.out.println("Ready.");
        l1:while (true) {
            System.out.println("===Menu===");
            System.out.println("1.Show Expense");
            System.out.println("2.Quit");
            System.out.println("Ent Choice");
            int ch = input.nextInt();
            switch (ch) {
                case 1->{
                    System.out.println("Who Paid ?" + PayerName);
                    System.out.println("Total in Person:" + TotalFriend);
                    System.out.println(ExpenseLine);
                    System.out.println(EachShare);
                }
                case 2-> {
                    System.out.println("GoodBye");
                    break l1;
                }default -> System.out.println("invald Choice");
            }
        }
    }
}