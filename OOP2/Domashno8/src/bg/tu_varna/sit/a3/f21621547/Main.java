package bg.tu_varna.sit.a3.f21621547;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        for (int i = 0; i < 4; i++) {
            weatherData.measurementsChanged();
        }

        weatherData.removeObserver(currentConditionsDisplay);
    }
}