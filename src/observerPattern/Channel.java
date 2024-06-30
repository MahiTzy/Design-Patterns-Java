package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    
    public List<Observer> subscribers = new ArrayList<Observer>();

    @Override
    public void register(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String title) {
        for(Observer observer: subscribers){
            observer.notified(title);
        }
    }

}
