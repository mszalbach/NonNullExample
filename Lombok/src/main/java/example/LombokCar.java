package example;

import lombok.Data;
import lombok.NonNull;

@Data
public class LombokCar implements Car {

    private final @NonNull String name;
    private final String vendor;
    private final int quantityOfDoors;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isName(@NonNull final String name) {
        return false;
    }
}
