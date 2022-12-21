package repository;

import machine.BarsVendingMachine;
import machine.ChipsVendingMachine;
import machine.DrinksVendingMachine;
import machine.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineRepository {
    private final Map<String, VendingMachine> vendingMachines;

    public VendingMachineRepository() {
        this.vendingMachines = new HashMap<>();
        vendingMachines.put("bars", new BarsVendingMachine());
        vendingMachines.put("chips", new ChipsVendingMachine());
        vendingMachines.put("drinks", new DrinksVendingMachine());
    }

    public VendingMachine get(String key) {
        return vendingMachines.get(key);
    }
}
