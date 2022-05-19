public class Car implements Comparable<Car> {

    String brent;
    String name;
    int size;

    Car(String brent, String name, int size) {
        this.brent = brent;
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Car o) {
        int result = this.brent.compareTo(o.brent);
        if (result == 0) {
            result = this.name.compareTo(o.name);
            if (result == 0) {
                result = Integer.compare(this.size, o.size);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brent='" + brent + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (size != car.size) return false;
        if (brent != null ? !brent.equals(car.brent) : car.brent != null) return false;
        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        int result = brent != null ? brent.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }
}
