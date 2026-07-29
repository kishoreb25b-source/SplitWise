import java.util.ArrayList;
import java.util.Scanner;

public class AddFriend {
    public void AddFriend(Scanner input, ArrayList friend){
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
    }
}
