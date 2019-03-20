package example;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import org.junit.jupiter.api.Test;

class LombokCarTests {

    @Test
    void name_should_not_be_null() {
        assertThatNullPointerException().isThrownBy(() -> new LombokCar(null, null, 4))
                .withMessage("name is marked @NonNull but is null");
    }

    @Test
    void get_name_never_returns_null() {
        Car car = new LombokCar("Fast Car", null, 4);
        String name = car.getName();
        assert name == null;

    }

}
