public class Person extends Node<Person> {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
//        if (this.age < o.age) {
//            return -1;
//        } else if (this.age == o.age) {
//            return 0;
//        } else {
//            return 1;
//        }
    }
}
