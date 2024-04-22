public class WeightBasedShippingStrategy implements ShippingStrategy{
    @Override
    public double calculatePrice(Product product) {
        return 100.0 * product.getWeight();
    }
}
