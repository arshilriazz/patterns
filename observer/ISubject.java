package patterns.observer;

public interface ISubject {
    void add(IObserver observer);
    void remove(IObserver observer);
    void sendNotification();
}
