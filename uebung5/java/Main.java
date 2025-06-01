package uebung5.java;
public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();
        MonitorWebsite website = new MonitorWebsite(5);

        User shiv = controller.registerUser("Shivansh", "1234567890", "muster@gmail.com");

        Subscription sub1 = controller.managesubscription(shiv, "https://abc.com", Commchannel.EMAIL, 5);
        website.attach(sub1);

        website.checkforUpdate(); // Will notify all observers (subscriptions)
    }
}
