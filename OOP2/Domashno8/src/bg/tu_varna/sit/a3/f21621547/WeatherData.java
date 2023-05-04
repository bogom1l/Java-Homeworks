package bg.tu_varna.sit.a3.f21621547;

import java.util.*;

class WeatherData implements Subject {
    private final List<Observer> observers;
    private int temperature;
    private int pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure);
        }
    }

    public void measurementsChanged() {
        Random rand = new Random();
        temperature = rand.nextInt(10);
        pressure = rand.nextInt(50);

        notifyObservers();
    }
}