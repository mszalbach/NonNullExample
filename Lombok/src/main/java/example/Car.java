package example;

import lombok.NonNull;

public interface Car {

    @NonNull String getName();

    int getQuantityOfDoors();

}
