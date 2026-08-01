package app;

import model.Friend;

import java.util.ArrayList;
import java.util.Scanner;
public class AddFriend {
    public void addFriend(Scanner input, ArrayList<Friend> friend){

        while (true) {
            input.nextLine();
            System.out.println("Enter Friend Name:");
            String friendName = input.nextLine();
            Friend f=new Friend(friendName);
            if (friendName.isEmpty()) {
                System.out.println("Re-Enter");
            } else {
                friend.add(f);
                System.out.println("Added %s (id %d).".formatted(f.getName(), f.getId()));
                break;
            }
        }
    }
}
