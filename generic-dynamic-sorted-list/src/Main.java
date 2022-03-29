public class Main {

    public static void main(String args[]) {
        SortedList<Person> personSortedList = new SortedList<>();
        personSortedList.push(new Person("Patrick", 15));
        personSortedList.push(new Person("Michael", 21));
        personSortedList.push(new Person("Gaby" , 11));

        System.out.println(personSortedList.size());

        for (int i = personSortedList.size(); i > 0; i--) {
            System.out.println(personSortedList.get(i).name);
            System.out.println(personSortedList.size());
        }

        SortedList<Car> carSortedList = new SortedList<>();
        carSortedList.push(new Car("BMW", 180));
        carSortedList.push(new Car("VW", 100));

        for (int i = carSortedList.size(); i > 0; i--) {
            System.out.println(carSortedList.get(i).brand);
            System.out.println(carSortedList.size());
        }
    }
}
