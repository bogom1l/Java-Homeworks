package bg.tu_varna.sit.a3.f21621547;

class CurrentConditionsDisplay implements Observer {
    private int temperature;
    private int pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + " degrees and " + pressure + " pressure");
    }
}