import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Friend> friend=new ArrayList<>();
        AddFriend addFriend=new AddFriend();
        System.out.println("Enter Payer Name");
        String PayerName = input.nextLine();
        System.out.println("Enter Amount(₹)");
        double TotalAmt = input.nextDouble();
        Expense expense=new Expense(PayerName,TotalAmt);
        System.out.println("====SplitWise====");
        System.out.println("Welcome to SplitWise");
        System.out.println("Track shares with Friends");
        System.out.println();
       System.out.println("Ready.");
        l1:while (true) {
            System.out.println("===Menu===");
            System.out.println("1.Show Expense");
            System.out.println("2.Add Friends");
            System.out.println("3.List Friends");
            System.out.println("4.Quit");
            System.out.println("Ent Choice");
            int ch = input.nextInt();
            switch (ch) {
                case 1-> {
                    int TotalFriend= friend.size();
                    if (TotalFriend == 0) {
                        System.out.println("No friends added.");
                    } else {
                        double SingleShare = expense.getAmount()/ TotalFriend;
                        System.out.println("Who Paid? => " + expense.getPayerName());
                        System.out.println("Total Persons: " + TotalFriend);
                        System.out.println("Total Amount(₹):"+expense.getAmount());
                        System.out.println("%s Paid(₹): %.2f".formatted(expense.getPayerName(),expense.getAmount()));
                        System.out.println("Each person needs to pay: " + "%.2f".formatted(SingleShare));
                    }
                }
                case 2->{
                    addFriend.addFriend(input,friend);
                }case 3->{
                    if (friend.isEmpty()){
                        System.out.println("Add Friends First");
                    }else {
                        System.out.println("Friends:");
                        for (int i = 0; i < friend.size(); i++) {
                            System.out.println(" -"+friend.get(i).getName());
                        }
                    }
                }
                case 4-> {
                    System.out.println("GoodBye");
                    break l1;
                }default -> System.out.println("Invalid Choice");
            }
        }
    }
}