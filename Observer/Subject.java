public interface Subject {
    public void attachObserver(Observer observer);
    public void dettachObserver(Observer observer);
    public void notifyObservers();
}
