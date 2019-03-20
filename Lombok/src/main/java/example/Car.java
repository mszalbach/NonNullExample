package example;

import lombok.NonNull;

public interface Car {

    String getName();

    int getQuantityOfDoors();

    boolean isName(@NonNull String name);

}
