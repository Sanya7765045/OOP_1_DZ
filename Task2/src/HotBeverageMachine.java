import java.util.ArrayList;
import java.util.List;

public class HotBeverageMachine implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProducts(List<Product> products) {
        productList.addAll(products);
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && product.getVolume() == volume &&
                    product instanceof HotBeverage && ((HotBeverage) product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}
