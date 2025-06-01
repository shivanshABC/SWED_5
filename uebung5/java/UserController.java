package uebung5.java;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserController {
    private Map<Integer, User> users = new HashMap<>();

    public User registerUser(String name, String phone, String email) {
        int userID = users.size() + 1;
        User user = new User(userID, name, phone, email);
        users.put(userID, user);
        return user;
    }

    public Subscription managesubscription(User user, String url, Commchannel channel, int frequency) {
        String subID = UUID.randomUUID().toString();
        Subscription sub = new Subscription(subID, channel, frequency, url, user);
        user.addSubscription(sub);
        return sub;
    }
}
