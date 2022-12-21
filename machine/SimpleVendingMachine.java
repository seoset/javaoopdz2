package machine;

import product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleVendingMachine implements VendingMachine {

    private final List<Product> products;
    private final Map<String, List<Product>> reservedProducts = new HashMap<>();

    public SimpleVendingMachine(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void reserveProducts(String code, List<Product> products) {
        reservedProducts.put(code, products);
    }

    @Override
    public List<Product> reserveProducts(String code) {
        return reservedProducts.get(code);
    }
}
