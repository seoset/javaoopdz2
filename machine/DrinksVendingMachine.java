package machine;

import product.CocaCola;
import product.Sprite;

import java.util.Arrays;

public class DrinksVendingMachine extends SimpleVendingMachine {

    public DrinksVendingMachine() {
        super(Arrays.asList(new CocaCola(), new Sprite()));
    }
}
