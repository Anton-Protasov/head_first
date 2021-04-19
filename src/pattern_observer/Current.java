package pattern_observer;

public class Current implements Observer, DisplayElement{
    private double temperature;
    private double pressure;
    private double humidity;
    private Subject weatherData;

    public Current(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C / " + humidity + "% / " + pressure + "Pa");
    }
}
