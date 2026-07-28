import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> friend=new ArrayList<>();
        System.out.println("Enter Amount");
        double TotalAmt = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Payer Name");
        String PayerName = input.nextLine();
        int TotalFriend = friend.size();
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
            System.out.println("2.Add Friends");
            System.out.println("3.List Friends");
            System.out.println("4.Quit");
            System.out.println("Ent Choice");
            int ch = input.nextInt();
            switch (ch) {
                case 1->{
                    System.out.println("Who Paid? => " + PayerName);
                    System.out.println("Total in Person:" + TotalFriend);
                    System.out.println(ExpenseLine);
                    System.out.println(EachShare);
                }
                case 2->{
                    while (true) {
                        input.nextLine();
                        System.out.println("Enter Friend Name:");
                        String friendName = input.nextLine();
                        if (friendName.isEmpty()) {
                            System.out.println("Re-Enter");
                        }else {
                            friend.add(friendName);
                            System.out.println(friendName + " Added.");
                            break;
                        }
                    }
                }case 3->{
                    if (friend.isEmpty()){
                        System.out.println("Add Friends First");
                    }else {
                        System.out.println("Friends:");
                        for (int i = 0; i < friend.size(); i++) {
                            System.out.println(friend.get(i));
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