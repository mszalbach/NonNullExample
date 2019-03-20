package example;

import org.junit.jupiter.api.Test;

class IntelliJCarTests {

    //Will throw java.lang.IllegalArgumentException: Argument for @NotNull parameter 'name' of de/ivu/example/IntelliJCar.<init> must not be null
    //when executed in IntelliJ
    //will work in Maven
    //For Maven:
    //https://github.com/osundblad/intellij-annotations-instrumenter-maven-plugin
    @Test
    void name_should_not_be_null() {
        new IntelliJCar(null, null, 4);
    }

    @Test
    void get_name_never_returns_null() {
        Car car = new IntelliJCar("Fast Car", null, 4);

        String name = car.getName();
        assert name == null;

    }

}
