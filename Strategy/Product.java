public class Product {
    private final String name;
    private final int weight;
    private final int volume;
    public Product(String name, int weight, int volume){
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getVolume(){
        return this.volume;
    }
    public String getName() {
        return name;
    }
}
