package example;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IntelliJCar implements Car {

    private final String name;
    private String vendor;
    private final int quantityOfDoors;

    IntelliJCar(@NotNull String name, @Nullable String vendor, int quantityOfDoors) {
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

    public String getVendor() {
        return vendor;
    }
}
