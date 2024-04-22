public class Main {
    public static void main(String[] args) {
        Product smallProduct = new Product("Small Product", 1, 1);
        Product largeProduct = new Product("Large Product", 10, 100);

        ShippingStrategy weightBasedStrategy = new WeightBasedShippingStrategy();
        ShippingStrategy volumeBasedStrategy = new VolumeBasedShippingStrategy();

        ShippingCalculator calculator = new ShippingCalculator();

        calculator.setShippingStrategy(weightBasedStrategy);

        System.out.println("Shipping cost for " + smallProduct.getName() + ": $" + calculator.calculateShippingCost(smallProduct));

        calculator.setShippingStrategy(volumeBasedStrategy);

        System.out.println("Shipping cost for " + largeProduct.getName() + ": $" + calculator.calculateShippingCost(largeProduct));
    }
}
