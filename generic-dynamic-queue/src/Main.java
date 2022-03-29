public class Main {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();
        integerQueue.push(new Node<>(1));
        integerQueue.push(new Node<>(2));
        integerQueue.push(new Node<>(3));

        for (int i = 0; i < 3; i++) {
            System.out.println(integerQueue.get().value);
        }

        Queue<String> stringQueue = new Queue<>();
        stringQueue.push(new Node<>("Patrick"));
        stringQueue.push(new Node<>("Michael"));

        for (int i = 0; i < 2; i++) {
            System.out.println(stringQueue.get().value);
        }

    }
}
