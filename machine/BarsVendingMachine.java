package machine;

import product.CaramelBar;
import product.ChocolateBar;

import java.util.Arrays;

public class BarsVendingMachine extends SimpleVendingMachine {
    public BarsVendingMachine() {
        super(Arrays.asList(new ChocolateBar(), new CaramelBar()));
    }
}
