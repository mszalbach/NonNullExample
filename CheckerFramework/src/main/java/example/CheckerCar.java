package example;

import org.checkerframework.checker.nullness.qual.Nullable;

public class CheckerCar implements Car {

    private final String name;
    @Nullable
    private String vendor;
    private final int quantityOfDoors;

    CheckerCar(String name, @Nullable String vendor, int quantityOfDoors) {
        this.name = name;
        this.vendor = vendor;
        this.quantityOfDoors = quantityOfDoors;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getQuantityOfDoors() {
        return this.quantityOfDoors;
    }

    public @Nullable String getVendor() {
        return vendor;
    }
}
