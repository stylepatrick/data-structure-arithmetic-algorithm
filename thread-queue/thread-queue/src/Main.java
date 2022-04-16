public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        Thread reader = new Reader(queue);
        Thread writer = new Writer(queue);

        writer.start();
        reader.start();

    }

}
