public class VolumeBasedShippingStrategy implements ShippingStrategy{
    @Override
    public double calculatePrice(Product product) {
        return 100.0 * product.getVolume();
    }
}
