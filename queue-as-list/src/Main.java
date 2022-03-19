public class Main {

    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());

        queue.push(6);

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
    }
}
