package uebung5.java;
import java.util.ArrayList;
import java.util.List;

public class MonitorWebsite implements Subject {
    public int checkInterval;
    private List<Observer> observers;

    public MonitorWebsite(int checkInterval) {
        this.checkInterval = checkInterval;
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void checkforUpdate() {
        boolean updated = rectifyupdate();
        System.out.println("Update detected: " + updated);
        if (updated) {
            notifyObservers("Website content updated.");
        }
    }

    public boolean rectifyupdate() {
        return true; // simulate that website is always updated
    }
}
