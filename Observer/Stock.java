import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Stock implements Subject{
    private final List<Observer> observers = new CopyOnWriteArrayList<>();
    private final String name;
    private double price;
    public Stock(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
        notifyObservers();
    }

    public double getPrice(){
        return price;
    }
    @Override
    public void attachObserver(Observer observer) {
        observer.addObservable(this);
        observers.add(observer);
    }

    @Override
    public void dettachObserver(Observer observer) {
        observer.removeObservable(this);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }
}
