package weather_project;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    public void notifyObservers();
}
