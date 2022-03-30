public class Main {

    public static void main(String args[]) {
        SortedList<Person> personSortedList = new SortedList<>();
        personSortedList.push(new Person("Patrick", 15));
        personSortedList.push(new Person("Michael", 21));
        personSortedList.push(new Person("Gaby" , 11));

        System.out.println(personSortedList.size());

        print(personSortedList);

        for (int i = personSortedList.size(); i > 0; i--) {
            Person person = personSortedList.get(i);
            person.print();
            System.out.println(personSortedList.size());
        }

        SortedList<Car> carSortedList = new SortedList<>();
        carSortedList.push(new Car("BMW", 180));
        carSortedList.push(new Car("VW", 100));

        print(carSortedList);

        System.out.println(carSortedList.size());

        for (int i = carSortedList.size(); i > 0; i--) {
            Car car = carSortedList.get(i);
            car.print();
            System.out.println(carSortedList.size());
        }
    }

    private static void print(SortedList<?> sortedList) {
        System.out.println("---");
        sortedList.print();
        System.out.println("---");
    }
}
