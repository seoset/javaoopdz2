package controller;

import machine.VendingMachine;
import product.Product;
import service.VendingMachineService;

import java.util.List;

public class MainController {
    private final VendingMachineService service = new VendingMachineService();

    public List<Product> getProducts(String key) {
        return service.getProducts(key);
    }

    public VendingMachine getMachine(String key) {
        return service.getMachine(key);
    }

    public String reserveProducts(String key, List<Product> products) {
        return service.reserveProducts(getMachine(key), products);
    }

    public String reserveProducts(VendingMachine machine, List<Product> products) {
        return service.reserveProducts(machine, products);
    }

    public List<Product> getProductsByCode(String key, String code) {
        return service.getProductsByCode(key, code);
    }

    public static void main(String[] args) {
        MainController controller = new MainController();
        List<Product> barProducts = controller.getProducts("bars");
        System.out.println(barProducts);
        String code = controller.reserveProducts("bars", barProducts);
        System.out.println("Reserved code: " + code);
        System.out.printf("Code: %s, Products: %s%n", code, controller.getProductsByCode("bars", code));
    }

}
