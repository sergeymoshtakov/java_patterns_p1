public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Google", 100.0);

        Observer observer1 = new StockObserver("Observer 1");
        Observer observer2 = new StockObserver("Observer 2");

        stock.attachObserver(observer1);
        stock.attachObserver(observer2);

        stock.setPrice(105.0);
    }
}
