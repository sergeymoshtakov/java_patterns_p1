public class StockObserver implements Observer{
    private final String name;
    private Stock stock;
    public StockObserver(String name){
        this.name = name;
    }
    public void setStock(Stock stock){
        this.stock = stock;
    }

    public Stock getStock(){
        return stock;
    }

    @Override
    public void update() {
        System.out.println(this.name + " > " + this.stock.getName() + " : " + this.stock.getPrice());
    }

    @Override
    public void addObservable(Subject sub) {
        this.stock = (Stock) sub;
    }

    @Override
    public void removeObservable(Subject sub) {
        this.stock = null;
    }
}
