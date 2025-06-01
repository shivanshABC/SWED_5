package uebung5.java;
import java.time.LocalDateTime;

public class Notification {
    private String notificationID;
    private String message;
    public LocalDateTime timeStamp;

    public Notification(String notificationID, String message) {
        this.notificationID = notificationID;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
    }

    public void sendNotification(String contactInfo, Commchannel channel) {
        System.out.println("[" + channel + "] Notification to " + contactInfo + ": " + message + " at " + timeStamp);
    }
}