package uebung5.java;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int userID;
    public String name;
    private String phone;
    private String email;
    private List<Subscription> subscriptions;

    public User(int userID, String name, String phone, String email) {
        this.userID = userID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.subscriptions = new ArrayList<>();
    }

    public void addSubscription(Subscription sub) {
        subscriptions.add(sub);
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public String getContact(Commchannel channel) {
        return channel == Commchannel.EMAIL ? email : phone;
    }
}
