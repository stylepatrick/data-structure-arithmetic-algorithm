import java.util.Objects;

public class Car {

    int value;
    int amount;

    Car(int c, int a) {
        this.value =c;
        this.amount = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car1 = (Car) o;
        return value == car1.value && amount == car1.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, amount);
    }
}
