package bg.tu_varna.sit.a3.f21621547;

interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}