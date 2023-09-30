import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product tea = new HotBeverage("Tea", 10, 200, 80);
        Product coffee = new HotBeverage("Coffee", 15, 150, 90);

        HotBeverageMachine machine = new HotBeverageMachine();
        List<Product> products = new ArrayList<>();
        products.add(tea);
        products.add(coffee);
        machine.initProducts(products);

        Product product = machine.getProduct("Tea", 200, 80);
        if (product != null) {
            System.out.println("Received: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }
}
