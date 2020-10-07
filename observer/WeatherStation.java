package patterns.observer;

import java.util.*;

public class WeatherStation implements ISubject{
    private List<IObserver> observers = new ArrayList<>();
    private int temperature = 30;
    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void sendNotification() {
        for(IObserver observer : this.observers) {
            observer.update();
        }
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
