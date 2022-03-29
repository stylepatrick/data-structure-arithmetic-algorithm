public class Main {

    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>(5);
        stringQueue.push("Patrick");
        stringQueue.push("Michael");
        stringQueue.push("Andreas");
        stringQueue.push("Test");

        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());


        Queue<Integer> integerQueue = new Queue<>(3);
        integerQueue.push(1);
        integerQueue.push(2);

        System.out.println(integerQueue.get());
        System.out.println(integerQueue.get());
        System.out.println(integerQueue.get());
    }

}
