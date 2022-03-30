public class Car extends Node<Car> {

    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car h) {
        return Integer.compare(this.speed, h.speed);
    }

    @Override
    public void print() {
        System.out.println(this.brand + " - " + this.speed);
    }

}
