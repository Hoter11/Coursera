package assignments.week2.observer;

import java.util.ArrayList;

public class Channel implements Subject {

    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.observers = new ArrayList<Observer>();
        this.channelName = channelName;
        this.status = status;
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer: this.observers) {
            observer.update(this.channelName);
        }
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
        this.notifyObservers();
    }
}
