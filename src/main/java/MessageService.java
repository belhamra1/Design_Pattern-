// MessageService.java
import java.util.ArrayList;
import java.util.List;

public class MessageService implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notify(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
