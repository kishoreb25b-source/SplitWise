package app;

import model.Friend;

import java.util.ArrayList;
import java.util.Scanner;
public class AddFriend {
    public Friend addFriend(Scanner input, ArrayList<Friend> friend){

        while (true) {
            input.nextLine();
            System.out.println("Enter Friend Name:");
            String friendName = input.nextLine();
            Friend f=new Friend(friendName);
            if (friendName.isEmpty()) {
                System.out.println("Re-Enter");
            } else {
                friend.add(f);
                return (f);
            }
        }
    }
}
