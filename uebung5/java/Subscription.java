package uebung5.java;

public class Subscription implements Observer {
    private String registrationID;
    private Commchannel communication;
    public int frequency;
    public String url;
    private boolean active;
    private User user;

    public Subscription(String registrationID, Commchannel communication, int frequency, String url, User user) {
        this.registrationID = registrationID;
        this.communication = communication;
        this.frequency = frequency;
        this.url = url;
        this.active = true;
        this.user = user;
    }

    public void updateSubscription(int newFrequency, Commchannel newChannel) {
        this.frequency = newFrequency;
        this.communication = newChannel;
    }

    public void cancelSubscription() {
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public Commchannel getCommunication() {
        return communication;
    }

    public String getUrl() {
        return url;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    @Override
    public void update(String message) {
        Notification notification = new Notification("notif-" + registrationID, message);
        notification.sendNotification(user.getContact(communication), communication);
    }
}
