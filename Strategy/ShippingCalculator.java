public class ShippingCalculator {
    private ShippingStrategy shippingStrategy;
    public void setShippingStrategy(ShippingStrategy shippingStrategy){
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(Product product){
        return this.shippingStrategy.calculatePrice(product);
    }
}
