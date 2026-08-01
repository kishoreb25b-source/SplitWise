package app;

import model.ExpRecord;
import model.Friend;

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
        ExpRecord expense=new ExpRecord(PayerName,TotalAmt);
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
                        double SingleShare = expense.amount()/ TotalFriend;
                        System.out.println("Who Paid? => " + expense.payerName());
                        System.out.println("Total Persons: " + TotalFriend);
                        System.out.println("Total Amount(₹):"+expense.amount());
                        System.out.println("%s Paid(₹): %.2f".formatted(expense.payerName(), expense.amount()));
                        System.out.println("Each person needs to pay: " + "%.2f".formatted(SingleShare));
                    }
                }
                case 2->{
                    Friend f = addFriend.addFriend(input, friend);
                    System.out.println(FriendDisplay.addedMessage(f));
                }
                case 3->{
                    if (friend.isEmpty()){
                        System.out.println("Add Friends First");
                    }else {
                        System.out.println("Friends:");
                        for (Friend f : friend) {
                            System.out.println(FriendDisplay.listLine(f));
                        }
                    }
                }
                case 4-> {
                    System.out.println("Thank You,Visit Again");
                    break l1;
                }default -> System.out.println("Invalid Choice");
            }
        }
    }
    private static class FriendDisplay {
        static String listLine(Friend friend) {
            return "- %d: %s".formatted(friend.getId(), friend.getName());
        }

        static String addedMessage(Friend friend) {
            return "Added %s (id %d).".formatted(friend.getName(), friend.getId());
        }
    }
}