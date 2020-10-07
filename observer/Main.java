package patterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Subscriber subscriber1 = new Subscriber(weatherStation);
        Subscriber subscriber2 = new Subscriber(weatherStation);
        Subscriber subscriber3 = new Subscriber(weatherStation);
        weatherStation.add(subscriber1);
        weatherStation.add(subscriber2);
        weatherStation.add(subscriber3);
        weatherStation.sendNotification();
        subscriber1.display();
        subscriber2.display();
        subscriber3.display();
        weatherStation.setTemperature(32);
        weatherStation.sendNotification();
        subscriber1.display();
        subscriber2.display();
        subscriber3.display();
    }
}
