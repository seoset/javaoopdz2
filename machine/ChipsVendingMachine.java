package machine;

import product.CheeseChips;
import product.OnionChips;

import java.util.Arrays;

public class ChipsVendingMachine extends SimpleVendingMachine {

    public ChipsVendingMachine() {
        super(Arrays.asList(new CheeseChips(), new OnionChips()));
    }
}
