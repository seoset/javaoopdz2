package machine;

import product.Product;

import java.util.List;

public interface VendingMachine {
    List<Product> getProducts();

    void reserveProducts(String code, List<Product> products);
    List<Product> reserveProducts(String code);
}
