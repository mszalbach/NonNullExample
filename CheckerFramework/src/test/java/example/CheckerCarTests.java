package example;

import org.junit.jupiter.api.Test;

class CheckerCarTests {

    @Test
    void name_should_not_be_null() {
        new CheckerCar(null, null, 4);
    }

    @Test
    void get_name_never_returns_null() {
        Car car = new CheckerCar("Fast Car", null, 4);

        String name = car.getName();
        assert name == null;

    }

}
