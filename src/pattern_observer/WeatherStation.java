package pattern_observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Current current = new Current(weatherData);
        weatherData.setMeasurements(80, 65, 30);
    }
}
