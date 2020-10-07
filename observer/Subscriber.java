package patterns.observer;

public class Subscriber implements IObserver{
    private WeatherStation weatherStation;
    private int temperature;

    public Subscriber(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
    }

    public void display() {
        System.out.println(this.temperature);
    }
}
